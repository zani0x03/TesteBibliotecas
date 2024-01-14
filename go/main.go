package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
)

type Information struct {
	Data string `json:"data"`
}

func returnInformation(w http.ResponseWriter, r *http.Request) {
	information := Information{
		Data: "Hello World",
	}
	fmt.Println("Endpoint Hit: returnAllArticles")
	json.NewEncoder(w).Encode(information)
}

func handleRequests() {
	http.HandleFunc("/hello", returnInformation)
	log.Fatal(http.ListenAndServe(":5001", nil))
}

func main() {
	handleRequests()
}
