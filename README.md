# 🐙 SquidMonkey

**SquidMonkey** is a lightweight, language-agnostic scaffolding and snippet framework.  
It helps you generate project templates, boilerplate code, and common file structures in just a few commands.

Use it in **two ways**:
1. As a **Python SDK** (`sqwdmnky`)  
2. As a **VS Code extension** (optional integration)

---

## ✨ Features

- **Dual mode**: Python library or VS Code extension  
- **Interactive command window** (Python: `bigsqwd()` opens a 500×500 menu of commands)  
- **Template generators**: HTML5, CSS, Java, JS, XML, React, etc.  
- **Directory scaffolding**: Create folders and starter files instantly  
- **Custom templates**: Extend with your own `.json` or `.yaml` template packs  
- **Lightweight + fun**: No heavy setup, just fast scaffolding

---

## 📦 Installation

Clone the repo or install via pip:

```bash
pip install squid-monkey
For the VS Code extension, install SquidMonkey Tools from the Marketplace (coming soon).

🐍 Python SDK Usage
python
Copy code
from sqwdmnky import bigsqwd

# Show available commands in a 500x500 window
bigsqwd()

# Create a folder on your desktop called "MyApp"
sqwdname("desktop", "MyApp")

# Create an HTML5 template file called index.html
sqwdweb5("index.html")

# Create a starter CSS file
sqwdcss("style.css")

# Generate a Java class boilerplate
sqwdjava("Main.java")

# Generate a React component scaffold
sqwdreact("Button.js")
💻 VS Code Extension Usage
Install the SquidMonkey extension from the Marketplace

In any file, type at the top:

python
Copy code
import sqwd bigsqwd
(syntax will adapt depending on your language)

Open the Command Palette → “SquidMonkey: Insert Template”

Select a template (HTML, CSS, Java, React, etc)

File is created in your project automatically

📂 Default Templates
Out-of-the-box, SquidMonkey ships with common scaffolds:

sqwdweb5("index.html") → HTML5 skeleton

sqwdcss("style.css") → CSS boilerplate

sqwdjava("Main.java") → Java starter class

sqwdreact("Button.js") → React component

sqwdxml("data.xml") → XML structure

…and more to come.

🛠️ Custom Templates
You can define your own templates with placeholders:

json
Copy code
{
  "class": "class {{ClassName}}:\n    def __init__(self):\n        pass",
  "main": "if __name__ == '__main__':\n    print('Hello {{Name}}')"
}
SquidMonkey will ask you to fill in placeholders interactively.

🚀 Roadmap
 Python SDK with core commands

 Basic HTML, CSS, Java, JS templates

 VS Code extension integration

 Template packs (user-defined collections)

 Advanced UI for browsing templates

🤝 Contributing
Contributions are welcome!

Add new templates

Improve the SDK

Help with VS Code extension development

Fork the repo, open a PR, or start a discussion on issues.




