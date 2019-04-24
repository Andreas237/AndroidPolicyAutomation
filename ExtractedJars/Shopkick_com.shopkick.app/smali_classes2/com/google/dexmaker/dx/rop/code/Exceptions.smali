.class public final Lcom/google/dexmaker/dx/rop/code/Exceptions;
.super Ljava/lang/Object;
.source "Exceptions.java"


# static fields
.field public static final LIST_Error:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_ArithmeticException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_ClassCastException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_NegativeArraySizeException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_NullPointerException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_Null_ArrayIndexOutOfBounds:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_Null_ArrayIndex_ArrayStore:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final LIST_Error_Null_IllegalMonitorStateException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field public static final TYPE_ArithmeticException:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_ArrayIndexOutOfBoundsException:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_ArrayStoreException:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_ClassCastException:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_IllegalMonitorStateException:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_NegativeArraySizeException:Lcom/google/dexmaker/dx/rop/type/Type;

.field public static final TYPE_NullPointerException:Lcom/google/dexmaker/dx/rop/type/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "Ljava/lang/ArithmeticException;"

    .line 27
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArithmeticException:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/ArrayIndexOutOfBoundsException;"

    .line 34
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArrayIndexOutOfBoundsException:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/ArrayStoreException;"

    .line 38
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArrayStoreException:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/ClassCastException;"

    .line 42
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ClassCastException:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/Error;"

    .line 46
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/IllegalMonitorStateException;"

    .line 52
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_IllegalMonitorStateException:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/NegativeArraySizeException;"

    .line 56
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NegativeArraySizeException:Lcom/google/dexmaker/dx/rop/type/Type;

    const-string v0, "Ljava/lang/NullPointerException;"

    .line 60
    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NullPointerException:Lcom/google/dexmaker/dx/rop/type/Type;

    .line 64
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 70
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArithmeticException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_ArithmeticException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 77
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ClassCastException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_ClassCastException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 84
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NegativeArraySizeException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_NegativeArraySizeException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 91
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NullPointerException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_NullPointerException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 99
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NullPointerException:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v2, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArrayIndexOutOfBoundsException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_Null_ArrayIndexOutOfBounds:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 110
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NullPointerException:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v2, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArrayIndexOutOfBoundsException:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_ArrayStoreException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1, v2, v3}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_Null_ArrayIndex_ArrayStore:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 122
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_Error:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_NullPointerException:Lcom/google/dexmaker/dx/rop/type/Type;

    sget-object v2, Lcom/google/dexmaker/dx/rop/code/Exceptions;->TYPE_IllegalMonitorStateException:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/Exceptions;->LIST_Error_Null_IllegalMonitorStateException:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
