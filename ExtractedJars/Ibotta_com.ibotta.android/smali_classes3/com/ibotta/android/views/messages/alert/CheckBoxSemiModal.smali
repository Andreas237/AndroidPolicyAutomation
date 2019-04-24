.class public final Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;
.super Ljava/lang/Object;
.source "CheckBoxSemiModal.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;",
        "",
        "content",
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;",
        "(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V",
        "dismiss",
        "",
        "show",
        "Companion",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;


# instance fields
.field private final content:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->Companion:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->content:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;-><init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V

    return-void
.end method

.method public static final make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->Companion:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal$Companion;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final dismiss()V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->content:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->dismiss()V

    return-void
.end method

.method public final show()V
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->content:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->show()V

    return-void
.end method
