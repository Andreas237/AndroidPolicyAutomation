.class public final synthetic Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/browse/BrowseScreen;

.field private final synthetic f$1:Landroid/view/animation/Animation;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/browse/BrowseScreen;Landroid/view/animation/Animation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;->f$0:Lcom/shopkick/app/browse/BrowseScreen;

    iput-object p2, p0, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;->f$1:Landroid/view/animation/Animation;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;->f$0:Lcom/shopkick/app/browse/BrowseScreen;

    iget-object v1, p0, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$p-gC76edH3vEvwWf5KCk8CE8MEU;->f$1:Landroid/view/animation/Animation;

    invoke-static {v0, v1}, Lcom/shopkick/app/browse/BrowseScreen;->lambda$animatePauseIconRedDot$48(Lcom/shopkick/app/browse/BrowseScreen;Landroid/view/animation/Animation;)V

    return-void
.end method
