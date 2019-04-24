.class public Lcom/ibotta/android/security/crypto/key/AppKeyProvider;
.super Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;
.source "AppKeyProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    }
.end annotation


# static fields
.field private static final OBFUSC_API_KEY:[C

.field private static final OBFUSC_API_SECRET:[C

.field private static final OBFUSC_APPS_FLYER:[C

.field private static final OBFUSC_COMSCORE_SECRET:[C

.field private static final OBFUSC_DEVICE_SECURITY_KEY:[C

.field private static final OBFUSC_GOOGLE_WEB_CLIENT_ID:[C

.field private static final OBFUSC_HOCKEY_APP_ALPHA:[C

.field private static final OBFUSC_HOCKEY_APP_BETA:[C

.field private static final OBFUSC_HOCKEY_APP_BETA_EXT:[C

.field private static final OBFUSC_HOCKEY_APP_QA:[C

.field private static final OBFUSC_HOCKEY_APP_RELEASE:[C

.field private static final OBFUSC_JSON_KEY:[C

.field private static final OBFUSC_LAUNCH_DARKLY_PROD:[C

.field private static final OBFUSC_LAUNCH_DARKLY_TEST:[C

.field private static final OBFUSC_NEW_RELIC_APP_TOKEN:[C

.field private static final OBFUSC_RADAR_PK_LIVE:[C

.field private static final OBFUSC_RADAR_PK_TEST:[C

.field private static final OBFUSC_SCANDIT_KEY:[C

.field private static final OBFUSC_STRIPE_PK_LIVE:[C

.field private static final OBFUSC_STRIPE_PK_TEST:[C

.field private static final OBFUSC_TUNE_KEY:[C

.field private static final OBFUSC_TWITTER_KEY:[C

.field private static final OBFUSC_TWITTER_SECRET:[C

.field private static final OBFUSC_WINDFALL:[C


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x12

    .line 8
    new-array v1, v0, [C

    fill-array-data v1, :array_0

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_API_KEY:[C

    const/16 v1, 0x13

    .line 14
    new-array v1, v1, [C

    fill-array-data v1, :array_1

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_API_SECRET:[C

    .line 20
    new-array v0, v0, [C

    fill-array-data v0, :array_2

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_JSON_KEY:[C

    const/16 v0, 0x10

    .line 26
    new-array v0, v0, [C

    fill-array-data v0, :array_3

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_DEVICE_SECURITY_KEY:[C

    const/16 v0, 0x19

    .line 32
    new-array v0, v0, [C

    fill-array-data v0, :array_4

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_TWITTER_KEY:[C

    const/16 v0, 0x32

    .line 38
    new-array v0, v0, [C

    fill-array-data v0, :array_5

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_TWITTER_SECRET:[C

    const/16 v0, 0x20

    .line 46
    new-array v1, v0, [C

    fill-array-data v1, :array_6

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_COMSCORE_SECRET:[C

    .line 53
    new-array v1, v0, [C

    fill-array-data v1, :array_7

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_TUNE_KEY:[C

    const/16 v1, 0x2a

    .line 60
    new-array v1, v1, [C

    fill-array-data v1, :array_8

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_NEW_RELIC_APP_TOKEN:[C

    const/16 v1, 0x2b

    .line 67
    new-array v1, v1, [C

    fill-array-data v1, :array_9

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_SCANDIT_KEY:[C

    const/16 v1, 0x48

    .line 74
    new-array v1, v1, [C

    fill-array-data v1, :array_a

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_GOOGLE_WEB_CLIENT_ID:[C

    const/16 v1, 0x34

    .line 83
    new-array v2, v1, [C

    fill-array-data v2, :array_b

    sput-object v2, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_RADAR_PK_TEST:[C

    .line 91
    new-array v1, v1, [C

    fill-array-data v1, :array_c

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_RADAR_PK_LIVE:[C

    .line 99
    new-array v1, v0, [C

    fill-array-data v1, :array_d

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_STRIPE_PK_LIVE:[C

    .line 105
    new-array v1, v0, [C

    fill-array-data v1, :array_e

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_STRIPE_PK_TEST:[C

    .line 111
    new-array v1, v0, [C

    fill-array-data v1, :array_f

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_ALPHA:[C

    .line 117
    new-array v1, v0, [C

    fill-array-data v1, :array_10

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_BETA:[C

    .line 123
    new-array v1, v0, [C

    fill-array-data v1, :array_11

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_BETA_EXT:[C

    .line 129
    new-array v1, v0, [C

    fill-array-data v1, :array_12

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_QA:[C

    .line 135
    new-array v0, v0, [C

    fill-array-data v0, :array_13

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_RELEASE:[C

    const/16 v0, 0x16

    .line 141
    new-array v0, v0, [C

    fill-array-data v0, :array_14

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_APPS_FLYER:[C

    const/16 v0, 0xd0

    .line 147
    new-array v0, v0, [C

    fill-array-data v0, :array_15

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_WINDFALL:[C

    const/16 v0, 0x28

    .line 165
    new-array v1, v0, [C

    fill-array-data v1, :array_16

    sput-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_LAUNCH_DARKLY_TEST:[C

    .line 172
    new-array v0, v0, [C

    fill-array-data v0, :array_17

    sput-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_LAUNCH_DARKLY_PROD:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x21s
        -0x6bs
        0x14s
        -0x3bs
        -0x31s
        0x52bs
        0x20s
        0x1bs
        0x1cs
        0x2f3s
        -0x73s
        -0x64s
        -0x34s
        0x56s
        0x4s
        -0x65s
        0x4es
        -0x33s
    .end array-data

    :array_1
    .array-data 2
        0x33s
        -0x3bs
        0x46s
        -0x67s
        -0x75s
        0x57cs
        0x27s
        0x1as
        0x48s
        0x2fbs
        -0x68s
        -0x6ds
        -0x64s
        0x48s
        0x3s
        -0x71s
        0x49s
        -0x6bs
        0x46s
    .end array-data

    nop

    :array_2
    .array-data 2
        0x3fs
        -0x74s
        0x39s
        -0x44s
        -0x2cs
        0x543s
        0x65s
        0x78s
        0x6as
        0x2b5s
        -0x6as
        -0x64s
        -0x54s
        0x48s
        0x5as
        -0x64s
        0x1s
        -0x39s
    .end array-data

    :array_3
    .array-data 2
        0x31s
        -0x76s
        0x5as
        -0x3as
        -0x46s
        0x524s
        0x78s
        0x5ds
        0x1s
        0x2b7s
        -0x7ds
        -0x47s
        -0x7bs
        0x1ds
        0x37s
        -0x38s
    .end array-data

    :array_4
    .array-data 2
        0x1s
        -0x6es
        0x17s
        -0x68s
        -0x6bs
        0x57cs
        0x33s
        0x43s
        0x4bs
        0x2b7s
        -0x32s
        -0x5bs
        -0x77s
        0x50s
        0x5ds
        -0x31s
        0x47s
        -0x33s
        0x4bs
        -0x70s
        -0x52afs
        -0x77s
        -0x3bs
        0x19s
        0xas
    .end array-data

    nop

    :array_5
    .array-data 2
        0x2as
        -0x50s
        0xcs
        -0x6fs
        -0x35s
        0x543s
        0x13s
        0x6cs
        0x5bs
        0x2b0s
        -0x57s
        -0x51s
        -0x36s
        0x6fs
        0x39s
        -0x6ds
        0x62s
        -0x69s
        0x5es
        -0x4cs
        -0x529fs
        -0x48s
        -0x4es
        0x1bs
        0x74s
        0x24s
        0x15s
        -0x68s
        0x3cs
        -0x64s
        0x21s
        -0x6cs
        -0x73s
        0x554s
        0xbs
        0x79s
        0x63s
        0x2bbs
        -0x3cs
        -0x4ds
        -0x3cs
        0x9s
        0x4s
        -0x54s
        0x5bs
        -0x68s
        0x6bs
        -0x67s
        -0x52fes
        -0x66s
    .end array-data

    :array_6
    .array-data 2
        0x79s
        -0x3cs
        0x13s
        -0x33s
        -0x3bs
        0x57es
        0x27s
        0x4ds
        0x49s
        0x2f7s
        -0x37s
        -0x35s
        -0x65s
        0xbs
        0x5as
        -0x68s
        0x1ds
        -0x33s
        0x4s
        -0x68s
        -0x52f1s
        -0x37s
        -0x64s
        0x27s
        0x2s
        0x27s
        0x21s
        -0x65s
        0x78s
        -0x62s
        0x45s
        -0x61s
    .end array-data

    :array_7
    .array-data 2
        0x78s
        -0x67s
        0x42s
        -0x31s
        -0x64s
        0x579s
        0x71s
        0x19s
        0x1as
        0x2f0s
        -0x31s
        -0x35s
        -0x61s
        0xes
        0xes
        -0x31s
        0x1ds
        -0x64s
        0x9s
        -0x61s
        -0x52fas
        -0x64s
        -0x35s
        0x22s
        0xbs
        0x76s
        0x23s
        -0x61s
        0x28s
        -0x31s
        0x14s
        -0x65s
    .end array-data

    :array_8
    .array-data 2
        0x8s
        -0x44s
        0x40s
        -0x33s
        -0x34s
        0x52bs
        0x72s
        0x1cs
        0x14s
        0x2a4s
        -0x32s
        -0x64s
        -0x32s
        0xds
        0x5ds
        -0x35s
        0x1as
        -0x65s
        0x54s
        -0x36s
        -0x52fbs
        -0x34s
        -0x35s
        0x74s
        0xas
        0x22s
        0x7ds
        -0x67s
        0x2fs
        -0x62s
        0x44s
        -0x33s
        -0x68s
        0x528s
        0x78s
        0x48s
        0x4fs
        0x2a4s
        -0x31s
        -0x36s
        -0x64s
        0xfs
    .end array-data

    :array_9
    .array-data 2
        0x20s
        -0x75s
        0x3es
        -0x32s
        -0x59s
        0x570s
        0x70s
        0x48s
        0x46s
        0x295s
        -0x74s
        -0x64s
        -0x5cs
        0x75s
        0x5cs
        -0x67s
        0x7ds
        -0x4cs
        0x1as
        -0x7bs
        -0x52a4s
        -0x65s
        -0x6fs
        0x79s
        0x70s
        0x22s
        0x28s
        -0x58s
        0x20s
        -0x66s
        0x3fs
        -0x35s
        -0x4bs
        0x56cs
        0x20s
        0x43s
        0x6as
        0x2a8s
        -0x66s
        -0x33s
        -0x77s
        0x7fs
        0x21s
    .end array-data

    nop

    :array_a
    .array-data 2
        0x78s
        -0x36s
        0x45s
        -0x31s
        -0x31s
        0x52as
        0x77s
        0x13s
        0x1cs
        0x2f4s
        -0x34s
        -0x35s
        -0x30s
        0xes
        0x2s
        -0x37s
        0x1es
        -0x77s
        0x5bs
        -0x6fs
        -0x52c0s
        -0x6es
        -0x6bs
        0x35s
        0x59s
        0x29s
        0x28s
        -0x70s
        0x24s
        -0x78s
        0x46s
        -0x3cs
        -0x6ds
        0x575s
        0x35s
        0x40s
        0x5as
        0x2ads
        -0x34s
        -0x6fs
        -0x74s
        0xfs
        0x55s
        -0x70s
        0x11s
        -0x2ds
        0x50s
        -0x73s
        -0x52bas
        -0x72s
        -0x2ds
        0x26s
        0x55s
        0x2cs
        0x22s
        -0x6fs
        0x2cs
        -0x78s
        0x6s
        -0x68s
        -0x71s
        0x579s
        0x2es
        0x45s
        0x58s
        0x2a7s
        -0x6ds
        -0x77s
        -0x2ds
        0x5bs
        0x3s
        -0x70s
    .end array-data

    :array_b
    .array-data 2
        0x26s
        -0x71s
        0x12s
        -0x5es
        -0x77s
        0x57fs
        0x32s
        0x5fs
        0x73s
        0x2b2s
        -0x6as
        -0x5es
        -0x68s
        0x1s
        0x8s
        -0x61s
        0x1as
        -0x34s
        0x8s
        -0x61s
        -0x52f2s
        -0x35s
        -0x65s
        0x70s
        0x3s
        0x20s
        0x75s
        -0x62s
        0x2bs
        -0x67s
        0x44s
        -0x3cs
        -0x68s
        0x579s
        0x71s
        0x1as
        0x15s
        0x2a0s
        -0x61s
        -0x32s
        -0x36s
        0x59s
        0x5as
        -0x61s
        0x4cs
        -0x67s
        0x52s
        -0x34s
        -0x52f2s
        -0x31s
        -0x38s
        0x79s
    .end array-data

    :array_c
    .array-data 2
        0x26s
        -0x71s
        0x12s
        -0x5es
        -0x6fs
        0x573s
        0x37s
        0x4es
        0x73s
        0x2b2s
        -0x6as
        -0x5es
        -0x62s
        0x5bs
        0x8s
        -0x35s
        0x4bs
        -0x64s
        0x3s
        -0x35s
        -0x52aes
        -0x67s
        -0x3bs
        0x70s
        0x59s
        0x74s
        0x23s
        -0x68s
        0x7es
        -0x33s
        0x41s
        -0x67s
        -0x33s
        0x57bs
        0x23s
        0x1bs
        0x1ds
        0x2a3s
        -0x68s
        -0x36s
        -0x37s
        0x5cs
        0x5fs
        -0x36s
        0x1cs
        -0x61s
        0x4s
        -0x38s
        -0x52fcs
        -0x67s
        -0x36s
        0x78s
    .end array-data

    :array_d
    .array-data 2
        0x39s
        -0x6as
        0x2as
        -0x6fs
        -0x6cs
        0x56cs
        0x24s
        0x74s
        0x4as
        0x2f6s
        -0x4cs
        -0x6as
        -0x56s
        0x4fs
        0x1ds
        -0x7bs
        0x6bs
        -0x6ds
        0x70s
        -0x68s
        -0x52b1s
        -0x55s
        -0x36s
        0x32s
        0xas
        0x31s
        0x70s
        -0x68s
        0x0s
        -0x36s
        0x47s
        -0x78s
    .end array-data

    :array_e
    .array-data 2
        0x39s
        -0x6as
        0x2as
        -0x77s
        -0x68s
        0x569s
        0x35s
        0x74s
        0x45s
        0x295s
        -0x67s
        -0x66s
        -0x78s
        0x61s
        0x3s
        -0x54s
        0x18s
        -0x4cs
        0x45s
        -0x57s
        -0x52fas
        -0x61s
        -0x59s
        0x28s
        0x48s
        0x7s
        0x16s
        -0x70s
        0x19s
        -0x7bs
        0x21s
        -0x51s
    .end array-data

    :array_f
    .array-data 2
        0x7fs
        -0x3bs
        0x13s
        -0x35s
        -0x31s
        0x52bs
        0x20s
        0x1cs
        0x1as
        0x2f7s
        -0x61s
        -0x64s
        -0x37s
        0xds
        0xfs
        -0x3bs
        0x18s
        -0x37s
        0x3s
        -0x36s
        -0x52ads
        -0x36s
        -0x37s
        0x20s
        0xbs
        0x26s
        0x20s
        -0x33s
        0x7es
        -0x67s
        0x41s
        -0x68s
    .end array-data

    :array_10
    .array-data 2
        0x79s
        -0x37s
        0x42s
        -0x31s
        -0x64s
        0x57fs
        0x73s
        0x4ds
        0x1es
        0x2f4s
        -0x68s
        -0x34s
        -0x38s
        0xbs
        0x5as
        -0x62s
        0x1ds
        -0x34s
        0x7s
        -0x34s
        -0x52b0s
        -0x35s
        -0x67s
        0x23s
        0xfs
        0x74s
        0x24s
        -0x67s
        0x78s
        -0x38s
        0x11s
        -0x36s
    .end array-data

    :array_11
    .array-data 2
        0x7as
        -0x3cs
        0x17s
        -0x3cs
        -0x38s
        0x52ds
        0x25s
        0x1cs
        0x14s
        0x2f3s
        -0x3bs
        -0x68s
        -0x37s
        0x9s
        0xas
        -0x65s
        0x49s
        -0x64s
        0x5s
        -0x68s
        -0x52ads
        -0x38s
        -0x34s
        0x20s
        0x2s
        0x25s
        0x77s
        -0x33s
        0x7bs
        -0x31s
        0x13s
        -0x3bs
    .end array-data

    :array_12
    .array-data 2
        0x7as
        -0x64s
        0x17s
        -0x31s
        -0x37s
        0x579s
        0x71s
        0x19s
        0x4as
        0x2f5s
        -0x64s
        -0x33s
        -0x37s
        0x5es
        0xds
        -0x62s
        0x49s
        -0x32s
        0x53s
        -0x34s
        -0x52fds
        -0x3cs
        -0x67s
        0x74s
        0x5fs
        0x26s
        0x77s
        -0x34s
        0x7fs
        -0x67s
        0x11s
        -0x3bs
    .end array-data

    :array_13
    .array-data 2
        0x2fs
        -0x34s
        0x46s
        -0x68s
        -0x32s
        0x52es
        0x20s
        0x1fs
        0x48s
        0x2a0s
        -0x37s
        -0x32s
        -0x35s
        0x5bs
        0x54s
        -0x68s
        0x4es
        -0x65s
        0x7s
        -0x38s
        -0x52a9s
        -0x37s
        -0x33s
        0x70s
        0x59s
        0x25s
        0x20s
        -0x31s
        0x7ds
        -0x38s
        0x16s
        -0x38s
    .end array-data

    :array_14
    .array-data 2
        0x10s
        -0x4ds
        0xds
        -0x68s
        -0x45s
        0x522s
        0x27s
        0x4fs
        0x5as
        0x29as
        -0x4fs
        -0x42s
        -0x52s
        0x1s
        0x5s
        -0x55s
        0x4cs
        -0x3bs
        0x68s
        -0x56s
        -0x5283s
        -0x66s
    .end array-data

    :array_15
    .array-data 2
        0x3as
        -0x51s
        0x2s
        -0x44s
        -0x44s
        0x55bs
        0x0s
        0x78s
        0x75s
        0x2f0s
        -0x3cs
        -0x77s
        -0x4fs
        0x55s
        0x0s
        -0x6cs
        0x4as
        -0x32s
        0x63s
        -0x33s
        -0x5291s
        -0x52s
        -0x38s
        0x29s
        0x58s
        0x2es
        0x17s
        -0x7cs
        0x2bs
        -0x31s
        0x19s
        -0x6as
        -0x71s
        0x54es
        0x17s
        0x7cs
        0x60s
        0x2a5s
        -0x6fs
        -0x7bs
        -0x77s
        0x68s
        0x21s
        -0x50s
        0x6as
        -0x79s
        0x2s
        -0x78s
        -0x52fas
        -0x64s
        -0x42s
        0x27s
        0x6fs
        0x11s
        0x76s
        -0x68s
        0x18s
        -0x5bs
        0xcs
        -0x44s
        -0x4ds
        0x560s
        0x77s
        0x46s
        0x5as
        0x286s
        -0x36s
        -0x73s
        -0x67s
        0x6fs
        0x1as
        -0x75s
        0x66s
        -0x42s
        0x74s
        -0x74s
        -0x52acs
        -0x6bs
        -0x61s
        0x3s
        0x73s
        0x4s
        0x33s
        -0x6as
        0x3bs
        -0x32s
        0x4cs
        -0x79s
        -0x56s
        0x55cs
        0x38s
        0x41s
        0x44s
        0x2b3s
        -0x75s
        -0x73s
        -0x6bs
        0x56s
        0x55s
        -0x67s
        0x65s
        -0x2es
        0x5bs
        -0x74s
        -0x52a1s
        -0x69s
        -0x37s
        0x11s
        0x7cs
        0x74s
        0x23s
        -0x47s
        0x31s
        -0x72s
        0x12s
        -0x2as
        -0x62s
        0x55fs
        0x2fs
        0x6fs
        0x40s
        0x2b7s
        -0x3bs
        -0x77s
        -0x50s
        0x5ds
        0x1s
        -0x3cs
        0x7as
        -0x46s
        0x77s
        -0x57s
        -0x52bfs
        -0x76s
        -0x4cs
        0x6as
        0x6as
        0x72s
        0x2ds
        -0x6es
        0x1s
        -0x45s
        0x32s
        -0x52s
        -0x42s
        0x559s
        0xbs
        0x53s
        0x46s
        0x288s
        -0x6cs
        -0x3cs
        -0x5bs
        0x4ds
        0x20s
        -0x5bs
        0x5fs
        -0x45s
        0x70s
        -0x70s
        -0x5283s
        -0x5cs
        -0x7cs
        0x36s
        0x77s
        0x2bs
        0x31s
        -0x67s
        0x2bs
        -0x61s
        0x39s
        -0x54s
        -0x62s
        0x56fs
        0x3bs
        0x45s
        0x7cs
        0x2a0s
        -0x66s
        -0x66s
        -0x75s
        0x0s
        0x2s
        -0x36s
        0x72s
        -0x70s
        0x48s
        -0x53s
        -0x52c0s
        -0x48s
        -0x65s
        0x26s
        0x4bs
        0x2cs
        0x70s
        -0x51s
        0x2ds
        -0x4ds
        0x12s
        -0x54s
        -0x64s
        0x554s
        0x34s
        0x18s
        0x58s
        0x288s
        -0x66s
        -0x40s
    .end array-data

    :array_16
    .array-data 2
        0x24s
        -0x6es
        0x17s
        -0x30s
        -0x3bs
        0x522s
        0x75s
        0x1bs
        0x14s
        0x2fas
        -0x65s
        -0x35s
        -0x30s
        0x5es
        0x8s
        -0x67s
        0x4bs
        -0x30s
        0x5s
        -0x3cs
        -0x52a9s
        -0x3bs
        -0x30s
        0x79s
        0x9s
        0x73s
        0x7cs
        -0x30s
        0x7as
        -0x35s
        0x41s
        -0x3bs
        -0x33s
        0x522s
        0x27s
        0x1es
        0x19s
        0x2f2s
        -0x38s
        -0x36s
    .end array-data

    :array_17
    .array-data 2
        0x24s
        -0x6es
        0x17s
        -0x30s
        -0x67s
        0x528s
        0x22s
        0x19s
        0x1bs
        0x2f5s
        -0x64s
        -0x33s
        -0x30s
        0x5bs
        0x9s
        -0x33s
        0x19s
        -0x30s
        0x5s
        -0x67s
        -0x52ads
        -0x35s
        -0x30s
        0x20s
        0x9s
        0x70s
        0x75s
        -0x30s
        0x7fs
        -0x34s
        0x10s
        -0x3cs
        -0x34s
        0x523s
        0x27s
        0x4as
        0x19s
        0x2a0s
        -0x3cs
        -0x67s
    .end array-data
.end method

.method public constructor <init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V
    .locals 0

    .line 216
    invoke-virtual {p1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->getObfuscatedKey()[C

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;-><init>([C)V

    return-void
.end method

.method static synthetic access$000()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_API_KEY:[C

    return-object v0
.end method

.method static synthetic access$100()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_API_SECRET:[C

    return-object v0
.end method

.method static synthetic access$1000()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_NEW_RELIC_APP_TOKEN:[C

    return-object v0
.end method

.method static synthetic access$1100()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_SCANDIT_KEY:[C

    return-object v0
.end method

.method static synthetic access$1200()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_GOOGLE_WEB_CLIENT_ID:[C

    return-object v0
.end method

.method static synthetic access$1300()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_RADAR_PK_TEST:[C

    return-object v0
.end method

.method static synthetic access$1400()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_RADAR_PK_LIVE:[C

    return-object v0
.end method

.method static synthetic access$1500()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_STRIPE_PK_LIVE:[C

    return-object v0
.end method

.method static synthetic access$1600()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_STRIPE_PK_TEST:[C

    return-object v0
.end method

.method static synthetic access$1700()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_ALPHA:[C

    return-object v0
.end method

.method static synthetic access$1800()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_BETA:[C

    return-object v0
.end method

.method static synthetic access$1900()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_BETA_EXT:[C

    return-object v0
.end method

.method static synthetic access$200()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_JSON_KEY:[C

    return-object v0
.end method

.method static synthetic access$2000()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_QA:[C

    return-object v0
.end method

.method static synthetic access$2100()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_HOCKEY_APP_RELEASE:[C

    return-object v0
.end method

.method static synthetic access$2200()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_APPS_FLYER:[C

    return-object v0
.end method

.method static synthetic access$2300()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_WINDFALL:[C

    return-object v0
.end method

.method static synthetic access$300()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_LAUNCH_DARKLY_PROD:[C

    return-object v0
.end method

.method static synthetic access$400()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_LAUNCH_DARKLY_TEST:[C

    return-object v0
.end method

.method static synthetic access$500()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_DEVICE_SECURITY_KEY:[C

    return-object v0
.end method

.method static synthetic access$600()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_TWITTER_KEY:[C

    return-object v0
.end method

.method static synthetic access$700()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_TWITTER_SECRET:[C

    return-object v0
.end method

.method static synthetic access$800()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_COMSCORE_SECRET:[C

    return-object v0
.end method

.method static synthetic access$900()[C
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->OBFUSC_TUNE_KEY:[C

    return-object v0
.end method
