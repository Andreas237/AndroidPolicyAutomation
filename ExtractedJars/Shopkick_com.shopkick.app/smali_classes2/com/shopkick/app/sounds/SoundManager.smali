.class public Lcom/shopkick/app/sounds/SoundManager;
.super Ljava/lang/Object;
.source "SoundManager.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field playerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/media/MediaPlayer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/sounds/SoundManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/sounds/SoundManager;->playerList:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 59
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/sounds/SoundManager;->playerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public play(Landroid/content/Context;I)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/sounds/SoundManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 49
    :cond_0
    invoke-static {p1, p2}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 51
    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 52
    iget-object p2, p0, Lcom/shopkick/app/sounds/SoundManager;->playerList:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    :cond_1
    return-void
.end method

.method public play(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/sounds/SoundManager;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "\\."

    .line 32
    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 33
    aget-object p2, p2, v0

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "raw"

    const-string v2, "com.shopkick.app"

    .line 36
    invoke-virtual {v0, p2, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_1

    .line 38
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;I)V

    :cond_1
    return-void
.end method
