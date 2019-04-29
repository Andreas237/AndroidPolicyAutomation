.class public Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "VideoPagerAdapter.java"


# instance fields
.field private videoStrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/FragmentManager;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;->videoStrings:Ljava/util/ArrayList;

    .line 19
    iput-object p2, p0, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;->videoStrings:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;->videoStrings:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 3

    .line 24
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "episodes_string"

    .line 25
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;->videoStrings:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    new-instance p1, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;

    invoke-direct {p1}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;-><init>()V

    .line 27
    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->setArguments(Landroid/os/Bundle;)V

    return-object p1
.end method
