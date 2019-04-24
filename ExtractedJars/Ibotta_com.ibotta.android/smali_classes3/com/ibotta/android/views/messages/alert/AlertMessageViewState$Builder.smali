.class public final Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
.super Ljava/lang/Object;
.source "AlertMessageViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertMessageViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertMessageViewState.kt\ncom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder\n*L\n1#1,51:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0008J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0008J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;",
        "",
        "()V",
        "duration",
        "",
        "iconResId",
        "",
        "message",
        "",
        "negativeText",
        "positiveText",
        "title",
        "build",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;",
        "value",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private duration:J

.field private iconResId:I

.field private message:Ljava/lang/String;

.field private negativeText:Ljava/lang/String;

.field private positiveText:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 19
    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->title:Ljava/lang/String;

    .line 20
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->duration:J

    const-string v0, ""

    .line 22
    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->message:Ljava/lang/String;

    const-string v0, ""

    .line 23
    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->positiveText:Ljava/lang/String;

    const-string v0, ""

    .line 24
    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->negativeText:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 38
    new-instance v8, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;

    .line 39
    iget-object v1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->title:Ljava/lang/String;

    .line 40
    iget-wide v2, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->duration:J

    .line 41
    iget v4, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->iconResId:I

    .line 42
    iget-object v5, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->message:Ljava/lang/String;

    .line 43
    iget-object v6, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->positiveText:Ljava/lang/String;

    .line 44
    iget-object v7, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->negativeText:Ljava/lang/String;

    move-object v0, v8

    .line 38
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;-><init>(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method

.method public final duration(J)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    iput-wide p1, v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->duration:J

    return-object v0
.end method

.method public final iconResId(I)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 28
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    iput p1, v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->iconResId:I

    return-object v0
.end method

.method public final message(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final negativeText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->negativeText:Ljava/lang/String;

    return-object v0
.end method

.method public final positiveText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->positiveText:Ljava/lang/String;

    return-object v0
.end method

.method public final title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->title:Ljava/lang/String;

    return-object v0
.end method
