Text generation with LLM via Ollama.

Running the application

The application need Ollama for providing LLMs. 
You can run Ollama locally on your laptop (macOS or Linux) by installing.
Ollama as a native application

First, make sure you have Ollama installed on your laptop (macOS or Linux).
Then, use Ollama to run the wizard-vicuna-uncensored:7b large language model.
ollama run wizard-vicuna-uncensored:7b

Finally, run the Spring Boot application.
Calling the application

http :9001/ollama/promt
method :GET

http :9001/ollama/promt/Why sky is blue?
