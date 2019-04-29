.class public final Lcom/mopub/common/Preconditions;
.super Ljava/lang/Object;
.source "Preconditions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/Preconditions$NoThrow;
    }
.end annotation


# static fields
.field public static final EMPTY_ARGUMENTS:Ljava/lang/String; = ""


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(ZZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    .line 18
    invoke-static {p0, p1, p2, p3}, Lcom/mopub/common/Preconditions;->checkArgumentInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(ZZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    .line 18
    invoke-static {p0, p1, p2, p3}, Lcom/mopub/common/Preconditions;->checkStateInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Ljava/lang/Object;ZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    .line 18
    invoke-static {p0, p1, p2, p3}, Lcom/mopub/common/Preconditions;->checkNotNullInternal(Ljava/lang/Object;ZLjava/lang/String;[Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(ZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    .line 18
    invoke-static {p0, p1, p2}, Lcom/mopub/common/Preconditions;->checkUiThreadInternal(ZLjava/lang/String;[Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static checkArgument(Z)V
    .locals 5

    const-string v0, "Illegal argument."

    const/4 v1, 0x1

    .line 30
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, ""

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p0, v1, v0, v2}, Lcom/mopub/common/Preconditions;->checkArgumentInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static checkArgument(ZLjava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    .line 37
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, p1, v1}, Lcom/mopub/common/Preconditions;->checkArgumentInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static varargs checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 45
    invoke-static {p0, v0, p1, p2}, Lcom/mopub/common/Preconditions;->checkArgumentInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method private static varargs checkArgumentInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 240
    :cond_0
    invoke-static {p2, p3}, Lcom/mopub/common/Preconditions;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_1

    .line 242
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 244
    :cond_1
    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static checkNotNull(Ljava/lang/Object;)V
    .locals 5

    const-string v0, "Object can not be null."

    const/4 v1, 0x1

    .line 75
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, ""

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p0, v1, v0, v2}, Lcom/mopub/common/Preconditions;->checkNotNullInternal(Ljava/lang/Object;ZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    .line 82
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, p1, v1}, Lcom/mopub/common/Preconditions;->checkNotNullInternal(Ljava/lang/Object;ZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static varargs checkNotNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 90
    invoke-static {p0, v0, p1, p2}, Lcom/mopub/common/Preconditions;->checkNotNullInternal(Ljava/lang/Object;ZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method private static varargs checkNotNullInternal(Ljava/lang/Object;ZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 266
    :cond_0
    invoke-static {p2, p3}, Lcom/mopub/common/Preconditions;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_1

    .line 268
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 270
    :cond_1
    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static checkState(Z)V
    .locals 5

    const-string v0, "Illegal state."

    const/4 v1, 0x1

    .line 52
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, ""

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p0, v1, v0, v2}, Lcom/mopub/common/Preconditions;->checkStateInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static checkState(ZLjava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    .line 59
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, p1, v1}, Lcom/mopub/common/Preconditions;->checkStateInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static varargs checkState(ZLjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 68
    invoke-static {p0, v0, p1, p2}, Lcom/mopub/common/Preconditions;->checkStateInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method private static varargs checkStateInternal(ZZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 253
    :cond_0
    invoke-static {p2, p3}, Lcom/mopub/common/Preconditions;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_1

    .line 255
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 257
    :cond_1
    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static checkUiThread()V
    .locals 5

    const-string v0, "This method must be called from the UI thread."

    const/4 v1, 0x1

    .line 97
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, ""

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v0, v2}, Lcom/mopub/common/Preconditions;->checkUiThreadInternal(ZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static checkUiThread(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    .line 105
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, p0, v1}, Lcom/mopub/common/Preconditions;->checkUiThreadInternal(ZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public static varargs checkUiThread(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 113
    invoke-static {v0, p0, p1}, Lcom/mopub/common/Preconditions;->checkUiThreadInternal(ZLjava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method private static varargs checkUiThreadInternal(ZLjava/lang/String;[Ljava/lang/Object;)Z
    .locals 2

    .line 277
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 280
    :cond_0
    invoke-static {p1, p2}, Lcom/mopub/common/Preconditions;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p0, :cond_1

    .line 282
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 284
    :cond_1
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static varargs format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 293
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 296
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 298
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MoPub preconditions had a format exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/IllegalFormatException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    return-object p0
.end method
