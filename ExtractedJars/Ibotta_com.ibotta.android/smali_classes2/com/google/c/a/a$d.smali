.class final Lcom/google/c/a/a$d;
.super Lcom/google/c/a/a$o;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1455
    new-instance v0, Lcom/google/c/a/a$d;

    invoke-direct {v0}, Lcom/google/c/a/a$d;-><init>()V

    sput-object v0, Lcom/google/c/a/a$d;->o:Lcom/google/c/a/a$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-string v0, "CharMatcher.digit()"

    .line 1458
    invoke-static {}, Lcom/google/c/a/a$d;->o()[C

    move-result-object v1

    invoke-static {}, Lcom/google/c/a/a$d;->p()[C

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/google/c/a/a$o;-><init>(Ljava/lang/String;[C[C)V

    return-void
.end method

.method private static o()[C
    .locals 1

    const-string v0, "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10"

    .line 1444
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    return-object v0
.end method

.method private static p()[C
    .locals 4

    const/16 v0, 0x1f

    .line 1448
    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    const-string v3, "0\u0660\u06f0\u07c0\u0966\u09e6\u0a66\u0ae6\u0b66\u0be6\u0c66\u0ce6\u0d66\u0e50\u0ed0\u0f20\u1040\u1090\u17e0\u1810\u1946\u19d0\u1b50\u1bb0\u1c40\u1c50\ua620\ua8d0\ua900\uaa50\uff10"

    .line 1450
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, 0x9

    int-to-char v3, v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
