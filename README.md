# Food App UI

A food delivery application UI built with Kotlin and Jetpack Compose. This project is currently focused on developing the home screen and will gradually expand into a complete application while following modern Android development practices.

---

## Current Features

The project currently includes:

- Home screen layout
- Featured food section
- Categories list using `LazyRow`
- Popular products list using `LazyRow`
- Bottom navigation bar
- Reusable Jetpack Compose components
- Custom application theme

---

## Project Structure

```text
app/
│
├── data/
│   ├── model/
│   │   ├── Category.kt
│   │   ├── Product.kt
│   │   ├── User.kt
│   │   ├── CartItem.kt
│   │   ├── Order.kt
│   │   └── OrderItem.kt
│   │
│   ├── remote/
│   │
│   └── repository/
│
├── ui/
│   ├── theme/
│   │   ├── Color.kt
│   │   ├── Theme.kt
│   │   └── Type.kt
│   │
│   ├── navigation/
│   │
│   ├── screens/
│   │   ├── HomeScreen.kt
│   │   ├── ProductDetailsScreen.kt
│   │   ├── CartScreen.kt
│   │   ├── CheckoutScreen.kt
│   │   ├── ProfileScreen.kt
│   │   ├── EditProfileScreen.kt
│   │   ├── OrderHistoryScreen.kt
│   │   ├── SearchScreen.kt
│   │   ├── SettingsScreen.kt
│   │   └── ThemeScreen.kt
│   │
│   └── components/
│       ├── ProductCard.kt
│       ├── CategoryChip.kt
│       ├── SearchBar.kt
│       ├── ProfileHeader.kt
│       ├── ProfileMenuItem.kt
│       ├── ThemeOption.kt
│       ├── ThemePreviewCard.kt
│       ├── LoadingIndicator.kt
│       ├── ErrorView.kt
│       └── EmptyState.kt
│
├── viewmodel/
│   ├── HomeViewModel.kt
│   ├── ProductViewModel.kt
│   ├── CartViewModel.kt
│   ├── ProfileViewModel.kt
│   ├── OrderViewModel.kt
│   └── SettingsViewModel.kt
│
├── utils/
│
└── MainActivity.kt
```

### Architecture

The application follows the **MVVM (Model–View–ViewModel)** architecture to keep the codebase modular, maintainable, and scalable.

- **data/** – Models, repositories, and remote data sources (Firebase).
- **ui/** – Screens, reusable Jetpack Compose components, navigation, and application theme.
- **viewmodel/** – Handles UI state and business logic.
- **utils/** – Shared utilities, constants, extensions, and helper classes.

This structure is designed to support future integration with Firebase Authentication, Cloud Firestore, Firebase Storage, and other modern Android development tools while maintaining a clean separation of responsibilities.
## Home Screen

The current home screen contains:

- Application title
- Featured food section
- Categories
- Popular products
- Bottom navigation bar

---

## Technologies

- Kotlin
- Jetpack Compose
- Material 3
- Android Studio

---

## Objectives

This project is being developed to improve practical experience with:

- Jetpack Compose
- Modern Android UI development
- Reusable UI components
- State management
- Clean project organization
- Android application architecture

---

## Roadmap

The following features are planned for future releases.

### Authentication

- [ ] Login
- [ ] Registration
- [ ] Forgot Password

### Navigation

- [ ] Compose Navigation
- [ ] Navigation between screens

### Product

- [ ] Product details
- [ ] Product search
- [ ] Category filtering
- [ ] Favorites

### Cart

- [ ] Shopping cart
- [ ] Quantity management
- [ ] Price calculation

### Checkout

- [ ] Delivery address
- [ ] Payment options
- [ ] Order confirmation

### User

- [ ] User profile
- [ ] Order history
- [ ] Settings

### Backend

- [ ] REST API integration
- [ ] Retrofit
- [ ] Repository pattern
- [ ] MVVM architecture
- [ ] Hilt dependency injection

### Database

- [ ] Room Database
- [ ] Offline support
- [ ] Favorite products storage

### Improvements

- [ ] Image loading with Coil
- [ ] Loading animations
- [ ] Error handling
- [ ] Responsive layouts
- [ ] Light and Dark themes

---

## Current Status

**Version:** `0.1.0`

Completed:

- Home screen
- Reusable UI components
- Categories section
- Popular products section
- Bottom navigation

The project is under active development, and new features will be added incrementally.

---

## Screenshots

Screenshots will be added as development progresses.

```text

```

---

## Notes

This repository is intended to document the development of a food delivery application using Jetpack Compose. The project will continue to evolve with additional screens, backend integration, local storage, improved architecture, and production-ready features. The focus is on writing clean, maintainable, and scalable Android code while applying modern development practices.

---

## Author

**Shakil Ashraf**

Computer Science & Engineering

Developing Android applications with Kotlin and Jetpack Compose.
