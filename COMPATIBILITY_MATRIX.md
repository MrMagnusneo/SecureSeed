# Compatibility Matrix

Target support window: `1.16.5` through `1.21.11`.

| Minecraft version | Module | Status |
| --- | --- | --- |
| 1.16.5 | `fabric-1.16.5` | Implemented (full logic) |
| 1.17.1 | `fabric-1.17.1` | Build-ready port starter |
| 1.18.2 | `fabric-1.18.2` | Build-ready port starter |
| 1.19.4 | `fabric-1.19.4` | Build-ready port starter |
| 1.20.1 | `fabric-1.20.1` | Build-ready port starter |
| 1.21.1 | `fabric-1.21.1` | Build-ready port starter |
| 1.21.10 | `fabric-1.21.10` | Build-ready port starter |
| 1.21.11 | `fabric-1.21.11` | Build-ready port starter |

Notes:
- Shared cryptographic and seed conversion code is centralized in `common`.
- World seed is enforced at exactly 1024 bits.
- Version-specific worldgen mixins still need per-version migration to reach full runtime parity with 1.16.5 behavior.
