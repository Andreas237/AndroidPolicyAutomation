.class public final Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;
.super Ljava/lang/Object;
.source "CheckBoxSemiModal.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;",
        "",
        "()V",
        "initLayout",
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;",
        "activity",
        "Landroid/app/Activity;",
        "make",
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;",
        "viewState",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
        "viewEvents",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;-><init>()V

    return-void
.end method

.method private final initLayout(Landroid/app/Activity;)Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;
    .locals 3

    const v0, 0x1020002

    .line 26
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 27
    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v1, Lcom/ibotta/views/R$layout;->view_check_box_semi_modal:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type com.ibotta.android.views.messages.alert.CheckBoxSemiModalContent"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEvents"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;->initLayout(Landroid/app/Activity;)Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    move-result-object p1

    .line 20
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->updateViewState(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 21
    invoke-virtual {p1, p3}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    .line 22
    new-instance p2, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;-><init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method
