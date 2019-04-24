.class public Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;
.super Ljava/lang/Object;
.source "BrowserPageViewClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;,
        Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;
    }
.end annotation


# instance fields
.field private final buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

.field private final flags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;

.field private final sourceToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/ButtonRepository;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/ButtonRepository;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->sourceToken:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->flags:Ljava/util/List;

    .line 43
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;)Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->listener:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;

    return-object p0
.end method


# virtual methods
.method public executePageViewRequest(Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->sourceToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->flags:Ljava/util/List;

    new-instance v3, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$PageViewFailableReceiver;-><init>(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Ljava/lang/String;Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$1;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/usebutton/sdk/internal/ButtonRepository;->postPageView(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    return-void
.end method

.method public setListener(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;->listener:Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;

    return-void
.end method
