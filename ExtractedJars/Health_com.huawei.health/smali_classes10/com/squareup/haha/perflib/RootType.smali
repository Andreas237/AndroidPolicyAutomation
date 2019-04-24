.class public final enum Lcom/squareup/haha/perflib/RootType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/squareup/haha/perflib/RootType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/haha/perflib/RootType;

.field public static final enum BUSY_MONITOR:Lcom/squareup/haha/perflib/RootType;

.field public static final enum DEBUGGER:Lcom/squareup/haha/perflib/RootType;

.field public static final enum FINALIZING:Lcom/squareup/haha/perflib/RootType;

.field public static final enum INTERNED_STRING:Lcom/squareup/haha/perflib/RootType;

.field public static final enum INVALID_TYPE:Lcom/squareup/haha/perflib/RootType;

.field public static final enum JAVA_LOCAL:Lcom/squareup/haha/perflib/RootType;

.field public static final enum JAVA_STATIC:Lcom/squareup/haha/perflib/RootType;

.field public static final enum NATIVE_LOCAL:Lcom/squareup/haha/perflib/RootType;

.field public static final enum NATIVE_MONITOR:Lcom/squareup/haha/perflib/RootType;

.field public static final enum NATIVE_STACK:Lcom/squareup/haha/perflib/RootType;

.field public static final enum NATIVE_STATIC:Lcom/squareup/haha/perflib/RootType;

.field public static final enum REFERENCE_CLEANUP:Lcom/squareup/haha/perflib/RootType;

.field public static final enum SYSTEM_CLASS:Lcom/squareup/haha/perflib/RootType;

.field public static final enum THREAD_BLOCK:Lcom/squareup/haha/perflib/RootType;

.field public static final enum UNKNOWN:Lcom/squareup/haha/perflib/RootType;

.field public static final enum UNREACHABLE:Lcom/squareup/haha/perflib/RootType;

.field public static final enum VM_INTERNAL:Lcom/squareup/haha/perflib/RootType;


# instance fields
.field private final mName:Ljava/lang/String;

.field private final mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 20
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "UNREACHABLE"

    const-string v2, "unreachable object"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->UNREACHABLE:Lcom/squareup/haha/perflib/RootType;

    .line 21
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "INVALID_TYPE"

    const-string v2, "invalid type"

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->INVALID_TYPE:Lcom/squareup/haha/perflib/RootType;

    .line 22
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "INTERNED_STRING"

    const-string v2, "interned string"

    const/4 v3, 0x2

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->INTERNED_STRING:Lcom/squareup/haha/perflib/RootType;

    .line 23
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "UNKNOWN"

    const-string v2, "unknown"

    const/4 v3, 0x3

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->UNKNOWN:Lcom/squareup/haha/perflib/RootType;

    .line 24
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "SYSTEM_CLASS"

    const-string v2, "system class"

    const/4 v3, 0x4

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->SYSTEM_CLASS:Lcom/squareup/haha/perflib/RootType;

    .line 25
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "VM_INTERNAL"

    const-string v2, "vm internal"

    const/4 v3, 0x5

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->VM_INTERNAL:Lcom/squareup/haha/perflib/RootType;

    .line 26
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "DEBUGGER"

    const-string v2, "debugger"

    const/4 v3, 0x6

    const/4 v4, 0x6

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->DEBUGGER:Lcom/squareup/haha/perflib/RootType;

    .line 27
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "NATIVE_LOCAL"

    const-string v2, "native local"

    const/4 v3, 0x7

    const/4 v4, 0x7

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->NATIVE_LOCAL:Lcom/squareup/haha/perflib/RootType;

    .line 28
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "NATIVE_STATIC"

    const-string v2, "native static"

    const/16 v3, 0x8

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->NATIVE_STATIC:Lcom/squareup/haha/perflib/RootType;

    .line 29
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "THREAD_BLOCK"

    const-string v2, "thread block"

    const/16 v3, 0x9

    const/16 v4, 0x9

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->THREAD_BLOCK:Lcom/squareup/haha/perflib/RootType;

    .line 30
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "BUSY_MONITOR"

    const-string v2, "busy monitor"

    const/16 v3, 0xa

    const/16 v4, 0xa

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->BUSY_MONITOR:Lcom/squareup/haha/perflib/RootType;

    .line 31
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "NATIVE_MONITOR"

    const-string v2, "native monitor"

    const/16 v3, 0xb

    const/16 v4, 0xb

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->NATIVE_MONITOR:Lcom/squareup/haha/perflib/RootType;

    .line 32
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "REFERENCE_CLEANUP"

    const-string v2, "reference cleanup"

    const/16 v3, 0xc

    const/16 v4, 0xc

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->REFERENCE_CLEANUP:Lcom/squareup/haha/perflib/RootType;

    .line 33
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "FINALIZING"

    const-string v2, "finalizing"

    const/16 v3, 0xd

    const/16 v4, 0xd

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->FINALIZING:Lcom/squareup/haha/perflib/RootType;

    .line 34
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "JAVA_LOCAL"

    const-string v2, "java local"

    const/16 v3, 0xe

    const/16 v4, 0xe

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->JAVA_LOCAL:Lcom/squareup/haha/perflib/RootType;

    .line 35
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "NATIVE_STACK"

    const-string v2, "native stack"

    const/16 v3, 0xf

    const/16 v4, 0xf

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->NATIVE_STACK:Lcom/squareup/haha/perflib/RootType;

    .line 36
    new-instance v0, Lcom/squareup/haha/perflib/RootType;

    const-string v1, "JAVA_STATIC"

    const-string v2, "java static"

    const/16 v3, 0x10

    const/16 v4, 0x10

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/squareup/haha/perflib/RootType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->JAVA_STATIC:Lcom/squareup/haha/perflib/RootType;

    .line 19
    const/16 v0, 0x11

    new-array v0, v0, [Lcom/squareup/haha/perflib/RootType;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->UNREACHABLE:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->INVALID_TYPE:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->INTERNED_STRING:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->UNKNOWN:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->SYSTEM_CLASS:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->VM_INTERNAL:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->DEBUGGER:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_LOCAL:Lcom/squareup/haha/perflib/RootType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_STATIC:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->THREAD_BLOCK:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->BUSY_MONITOR:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_MONITOR:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->REFERENCE_CLEANUP:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->FINALIZING:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->JAVA_LOCAL:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_STACK:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->JAVA_STATIC:Lcom/squareup/haha/perflib/RootType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sput-object v0, Lcom/squareup/haha/perflib/RootType;->$VALUES:[Lcom/squareup/haha/perflib/RootType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    iput p3, p0, Lcom/squareup/haha/perflib/RootType;->mType:I

    .line 44
    iput-object p4, p0, Lcom/squareup/haha/perflib/RootType;->mName:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/haha/perflib/RootType;
    .locals 1

    .line 19
    const-class v0, Lcom/squareup/haha/perflib/RootType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/RootType;

    return-object v0
.end method

.method public static values()[Lcom/squareup/haha/perflib/RootType;
    .locals 1

    .line 19
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->$VALUES:[Lcom/squareup/haha/perflib/RootType;

    invoke-virtual {v0}, [Lcom/squareup/haha/perflib/RootType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/haha/perflib/RootType;

    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/squareup/haha/perflib/RootType;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/squareup/haha/perflib/RootType;->mType:I

    return v0
.end method
