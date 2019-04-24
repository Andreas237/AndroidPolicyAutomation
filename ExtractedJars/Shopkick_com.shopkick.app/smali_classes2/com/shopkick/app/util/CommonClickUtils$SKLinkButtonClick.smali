.class public Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;
.super Ljava/lang/Object;
.source "CommonClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/CommonClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SKLinkButtonClick"
.end annotation


# instance fields
.field private originElement:Ljava/lang/Integer;

.field private originElementId:Ljava/lang/String;

.field private originOverlay:Ljava/lang/Integer;

.field private originScreen:Ljava/lang/Integer;

.field private sklink:Ljava/lang/String;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;)V
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 53
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->sklink:Ljava/lang/String;

    .line 64
    iput-object p3, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originScreen:Ljava/lang/Integer;

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originOverlay:Ljava/lang/Integer;

    .line 66
    iput-object p5, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originElement:Ljava/lang/Integer;

    .line 67
    iput-object p6, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originElementId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->sklink:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originScreen:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originOverlay:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originElement:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;->originElementId:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Z

    return-void
.end method
