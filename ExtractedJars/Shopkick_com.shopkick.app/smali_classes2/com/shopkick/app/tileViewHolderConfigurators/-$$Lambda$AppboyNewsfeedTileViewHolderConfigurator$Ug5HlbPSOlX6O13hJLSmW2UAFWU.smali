.class public final synthetic Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;

.field private final synthetic f$1:Lcom/appboy/models/cards/ShortNewsCard;

.field private final synthetic f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;Lcom/appboy/models/cards/ShortNewsCard;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;->f$1:Lcom/appboy/models/cards/ShortNewsCard;

    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;->f$1:Lcom/appboy/models/cards/ShortNewsCard;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;->f$2:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->lambda$onBindViewHolder$246(Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;Lcom/appboy/models/cards/ShortNewsCard;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
