.class public final Lcom/ibotta/android/views/messages/alert/AlertMessage;
.super Ljava/lang/Object;
.source "AlertMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u001f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/AlertMessage;",
        "",
        "activity",
        "Landroid/app/Activity;",
        "alertMessageContent",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageContent;",
        "cookieBarBuilder",
        "Lorg/aviran/cookiebar2/CookieBar$Builder;",
        "(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lorg/aviran/cookiebar2/CookieBar$Builder;)V",
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
.field public static final Companion:Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final alertMessageContent:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

.field private final cookieBarBuilder:Lorg/aviran/cookiebar2/CookieBar$Builder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->Companion:Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lorg/aviran/cookiebar2/CookieBar$Builder;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->alertMessageContent:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    iput-object p3, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->cookieBarBuilder:Lorg/aviran/cookiebar2/CookieBar$Builder;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lorg/aviran/cookiebar2/CookieBar$Builder;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/messages/alert/AlertMessage;-><init>(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lorg/aviran/cookiebar2/CookieBar$Builder;)V

    return-void
.end method

.method public static final make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)Lcom/ibotta/android/views/messages/alert/AlertMessage;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->Companion:Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/AlertMessage$Companion;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)Lcom/ibotta/android/views/messages/alert/AlertMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final dismiss()V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lorg/aviran/cookiebar2/CookieBar;->dismiss(Landroid/app/Activity;)V

    return-void
.end method

.method public final show()V
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->cookieBarBuilder:Lorg/aviran/cookiebar2/CookieBar$Builder;

    invoke-virtual {v0}, Lorg/aviran/cookiebar2/CookieBar$Builder;->show()Lorg/aviran/cookiebar2/CookieBar;

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->alertMessageContent:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initMargins()V

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessage;->alertMessageContent:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initCardView()V

    return-void
.end method
