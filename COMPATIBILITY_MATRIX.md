# Compatibility Matrix

Target support window: `1.16.5` through `1.21.10`.

| Minecraft version | Module | Status |
| --- | --- | --- |
| 1.16.5 | `fabric-1.16.5` | Implemented |
| 1.17.x | `fabric-1.21.10` port track | Planned (API migration required) |
| 1.18.x | `fabric-1.21.10` port track | Planned (API migration required) |
| 1.19.x | `fabric-1.21.10` port track | Planned (API migration required) |
| 1.20.x | `fabric-1.21.10` port track | Planned (API migration required) |
| 1.21.10 | `fabric-1.21.10` | Port started (Loom module + shared secure seed logic) |

Notes:
- Shared cryptographic and seed conversion code is centralized in `common`.
- Version-specific mixins must be migrated per target API/mappings to reach full runtime parity.
