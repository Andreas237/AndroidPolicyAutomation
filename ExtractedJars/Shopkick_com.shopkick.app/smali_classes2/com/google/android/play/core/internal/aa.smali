.class public Lcom/google/android/play/core/internal/aa;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x27

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "UID: ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "]  PID: ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Lcom/google/android/play/core/internal/aa;->a:Ljava/lang/String;

    return-void
.end method

.method private a(ILjava/lang/String;[Ljava/lang/Object;)I
    .locals 1

    const-string v0, "PlayCore"

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "PlayCore"

    iget-object v0, p0, Lcom/google/android/play/core/internal/aa;->a:Ljava/lang/String;

    invoke-static {v0, p2, p3}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static a()Lcom/google/android/play/core/internal/z;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/play/core/internal/ar;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/ar;-><init>()V

    return-object v0

    :cond_1
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/play/core/internal/ar;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/ar;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Lcom/google/android/play/core/internal/aq;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/aq;-><init>()V

    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/android/play/core/internal/an;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/an;-><init>()V

    return-object v0

    :pswitch_2
    new-instance v0, Lcom/google/android/play/core/internal/am;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/am;-><init>()V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/google/android/play/core/internal/al;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/al;-><init>()V

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/google/android/play/core/internal/ah;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/ah;-><init>()V

    return-object v0

    :pswitch_5
    new-instance v0, Lcom/google/android/play/core/internal/ag;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/ag;-><init>()V

    return-object v0

    :pswitch_6
    new-instance v0, Lcom/google/android/play/core/internal/ab;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/ab;-><init>()V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Unsupported Android Version"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static varargs a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " : "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    if-eqz p2, :cond_1

    array-length p1, p2

    if-lez p1, :cond_1

    :try_start_0
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1, p0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "PlayCore"

    const-string v1, "Unable to format "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_0
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, ", "

    invoke-static {p1, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p2, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " ["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    :goto_1
    return-object p0
.end method


# virtual methods
.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/play/core/internal/aa;->a(ILjava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public varargs a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 2

    const-string v0, "PlayCore"

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PlayCore"

    iget-object v1, p0, Lcom/google/android/play/core/internal/aa;->a:Ljava/lang/String;

    invoke-static {v1, p2, p3}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public varargs b(Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/play/core/internal/aa;->a(ILjava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public varargs c(Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/play/core/internal/aa;->a(ILjava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public varargs d(Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/play/core/internal/aa;->a(ILjava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
