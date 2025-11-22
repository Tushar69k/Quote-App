
# 📱 Quote App (Jetpack Compose)

A **simple, clean, and modern Quote App** built using **Jetpack Compose**.
The app loads motivational quotes from a **local JSON file** and presents them in a beautiful list layout.
Users can tap any quote to view detailed information on a separate screen.

---

## 🚀 Features

### ✅ **Quote Listing Screen**

* Displays all quotes fetched from a local JSON file (`assets` folder).
* Each quote card includes:

  * Quote text
  * Author
  * Neon-orange themed design

---

### 📝 **Quote Detail Screen**

* Enlarged view of the selected quote
* Clean layout and easy readability

---

### ⏳ **Splash Screen**

* Custom splash screen with your logo
* Shows for 3 seconds before loading the main UI
* Matches the app’s black & neon-orange theme

---

### ⚡ **Asynchronous Data Loading**

* Loads JSON using:

  ```kotlin
  CoroutineScope(Dispatchers.IO).launch { ... }
  ```
* Runs efficiently on a background thread

---

### 🎨 **Fully Jetpack Compose UI**

* Uses `Card`, `Row`, `Column`, `LazyColumn`, custom colors, and Material 3
* Neon theme using hex `#FF5E00`
* Modern and elegant UI design

---

### 🧭 **App Navigation**

* Simple navigation using:

  * `DataManager.currentPage`
  * `enum class Pages { LISTING, DETAIL }`
* No external navigation libraries required

---

## 📂 Project Structure

```
├── MainActivity.kt
├── DataManager.kt
├── Model/
│   └── Quote.kt
├── Screens/
│   ├── QuoteList.kt
│   ├── QuoteListItem.kt
│   ├── QuoteDetail.kt
├── assets/
│   └── quotes.json
└── ui/
    └── theme/
```

---

## 🖼️ Screenshots

(Add your app screenshots here if you want)

---

## 🧾 How It Works

### 1️⃣ **App starts → Splash Screen**

```
SplashApp() → SplashScreen()
```

### 2️⃣ **Data loads from JSON**

```
DataManager.LoadAssetsFromFile(context)
```

### 3️⃣ **If data available → List Screen**

```
QuoteListScreen(data)
```

### 4️⃣ **On item click → Detail Page**

```
QuoteDetail(quote)
```

---

## 📦 Tech Stack

* **Kotlin**
* **Jetpack Compose**
* **Material 3**
* **Coroutines (Dispatchers.IO)**
* **LazyColumn**
* **Card UI Components**

---

## 📁 JSON Data Format

Example `quotes.json`:

```json
[
  {
    "text": "Success is not final; failure is not fatal.",
    "author": "Winston Churchill"
  },
  {
    "text": "Believe you can and you're halfway there.",
    "author": "Theodore Roosevelt"
  }
]
```

---

## 🛠️ Setup Instructions

1. Clone this repository:

```bash
git clone https://github.com/your-username/QuoteApp.git
```

2. Open in **Android Studio**

3. Run on Emulator or Android Device

---

## 🤝 Contributing

Pull requests are welcome!
For major changes, please open an issue first.

---

## ⭐ Show Support

If you like this project, give it a **⭐ on GitHub**!

---
