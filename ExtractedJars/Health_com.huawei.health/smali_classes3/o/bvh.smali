.class public Lo/bvh;
.super Lo/bvu;
.source "SourceFile"

# interfaces
.implements Lo/bvx;
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public a:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:I

.field private k:Z

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

.field private n:I

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Z

.field private r:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 137
    invoke-direct {p0, p1}, Lo/bvu;-><init>(Landroid/content/Context;)V

    .line 31
    const-string v0, "GuiderHelpe"

    iput-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lo/bvh;->f:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/bvh;->a:I

    .line 121
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    .line 134
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvh;->q:Z

    .line 138
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvh;->c:Z

    .line 139
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 140
    const-string v0, "GuideHelpe"

    iput-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    .line 141
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 142
    invoke-direct {p0}, Lo/bvh;->I()V

    .line 143
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 146
    invoke-direct {p0, p1}, Lo/bvh;-><init>(Landroid/content/Context;)V

    .line 147
    iput-object p2, p0, Lo/bvh;->r:Landroid/os/Handler;

    .line 148
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 149
    return-void
.end method

.method private A()V
    .locals 1

    .line 658
    const/16 v0, 0x16

    iput v0, p0, Lo/bvh;->f:I

    .line 660
    return-void
.end method

.method private B()V
    .locals 4

    .line 616
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 617
    const/16 v0, 0xe

    iput v0, p0, Lo/bvh;->f:I

    .line 618
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 620
    :cond_0
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 621
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "321go\u5f00\u59cb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    invoke-virtual {p0}, Lo/bvh;->c()Lo/bvx;

    .line 624
    :goto_0
    return-void
.end method

.method private C()V
    .locals 2

    .line 640
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    .line 642
    const/16 v0, 0xc

    iput v0, p0, Lo/bvh;->f:I

    goto :goto_0

    .line 643
    :cond_0
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 644
    invoke-direct {p0}, Lo/bvh;->A()V

    goto :goto_0

    .line 647
    :cond_1
    const/16 v0, 0x2a

    iput v0, p0, Lo/bvh;->f:I

    .line 649
    :goto_0
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    .line 650
    return-void
.end method

.method private D()V
    .locals 1

    .line 628
    invoke-direct {p0}, Lo/bvh;->A()V

    .line 629
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    .line 630
    return-void
.end method

.method private E()V
    .locals 2

    .line 671
    iget v0, p0, Lo/bvh;->p:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/bvh;->p:I

    iget v1, p0, Lo/bvh;->h:I

    if-ge v0, v1, :cond_0

    .line 672
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 674
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lo/bvh;->p:I

    .line 675
    invoke-virtual {p0}, Lo/bvh;->c()Lo/bvx;

    .line 677
    :goto_0
    return-void
.end method

.method private F()V
    .locals 2

    .line 680
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x11

    if-ne v0, v1, :cond_0

    .line 681
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {p0, v0}, Lo/bvh;->c(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    goto :goto_0

    .line 682
    :cond_0
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_1

    .line 683
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {p0, v0}, Lo/bvh;->e(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    goto :goto_0

    .line 684
    :cond_1
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    .line 685
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireNamePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bvh;->b(Ljava/lang/String;)Lo/bvx;

    .line 686
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/16 v1, 0x9a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 688
    :cond_2
    :goto_0
    return-void
.end method

.method private I()V
    .locals 5

    .line 691
    iget-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 699
    iget-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    const-string v1, "B180"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 700
    iget-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    const-string v1, "B181"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 701
    iget-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    const-string v1, "B182"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 702
    iget-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    const-string v1, "D001"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 704
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 714
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B145"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 715
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B146"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 716
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B147"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 717
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B148"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 718
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B149"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B150"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B151"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    const-string v1, "B152"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    return-void
.end method

.method private a(ILjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 318
    const/16 v0, 0x8

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "1"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "2"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "3"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "4"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "5"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const-string v0, "6"

    const/4 v1, 0x5

    aput-object v0, v4, v1

    const-string v0, "7"

    const/4 v1, 0x6

    aput-object v0, v4, v1

    const-string v0, "8"

    const/4 v1, 0x7

    aput-object v0, v4, v1

    .line 319
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit16 v1, p1, 0x98

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 323
    :cond_0
    invoke-virtual {p0, p1}, Lo/bvh;->k(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 325
    const-string v0, "C001"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .line 250
    const-string v0, "m4a"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "aac"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mp3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 308
    const-string v0, "timer"

    iget-object v1, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 310
    const-string v0, "C030"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 313
    :cond_0
    const-string v0, "C003"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    :goto_0
    return-void
.end method

.method private c(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 289
    invoke-virtual {p0, p1}, Lo/bvh;->k(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 290
    invoke-direct {p0, p2}, Lo/bvh;->b(Ljava/util/List;)V

    .line 292
    return-void
.end method

.method private e(II)V
    .locals 5

    .line 264
    new-instance v4, Ljava/util/ArrayList;

    const/4 v0, 0x5

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 266
    invoke-direct {p0, p1, v4}, Lo/bvh;->a(ILjava/util/List;)V

    .line 268
    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 271
    const-string v0, "E021"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    :cond_0
    invoke-direct {p0, p2, v4}, Lo/bvh;->c(ILjava/util/List;)V

    .line 275
    const/4 v0, 0x1

    if-le p1, v0, :cond_1

    .line 277
    const-string v0, "B145"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    :cond_1
    invoke-virtual {p0, v4}, Lo/bvh;->e(Ljava/util/List;)Lo/bvz;

    .line 280
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bvh;->n:I

    .line 281
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 282
    return-void
.end method

.method private f()V
    .locals 2

    .line 534
    iget v0, p0, Lo/bvh;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 535
    invoke-direct {p0}, Lo/bvh;->C()V

    goto :goto_0

    .line 537
    :cond_0
    invoke-direct {p0}, Lo/bvh;->z()V

    .line 538
    :goto_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 524
    iget v0, p0, Lo/bvh;->f:I

    if-nez v0, :cond_0

    .line 525
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireNamePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bvh;->b(Ljava/lang/String;)Lo/bvx;

    .line 526
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/16 v1, 0x9a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 527
    :cond_0
    iget v0, p0, Lo/bvh;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 528
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v0

    iget-object v1, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/bvh;->d(II)Lo/bvx;

    goto :goto_0

    .line 530
    :cond_1
    invoke-direct {p0}, Lo/bvh;->f()V

    .line 531
    :goto_0
    return-void
.end method

.method private j()V
    .locals 2

    .line 607
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hotbody"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 608
    invoke-direct {p0}, Lo/bvh;->B()V

    goto :goto_0

    .line 610
    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Lo/bvh;->f:I

    .line 611
    iget-object v0, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireTrainpointpath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bvh;->d(Ljava/lang/String;)Lo/bvx;

    .line 613
    :goto_0
    return-void
.end method

.method private v()V
    .locals 4

    .line 596
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x23

    if-ne v0, v1, :cond_0

    .line 597
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 598
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "321go\u7ed3\u675f\uff0c\u9884\u62a5\u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    const/4 v0, -0x1

    iput v0, p0, Lo/bvh;->f:I

    goto :goto_0

    .line 600
    :cond_0
    iget v0, p0, Lo/bvh;->f:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    .line 601
    invoke-direct {p0}, Lo/bvh;->E()V

    goto :goto_0

    .line 603
    :cond_1
    invoke-direct {p0}, Lo/bvh;->F()V

    .line 604
    :goto_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 579
    iget v0, p0, Lo/bvh;->f:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 580
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 581
    const/16 v0, 0xf

    iput v0, p0, Lo/bvh;->f:I

    .line 582
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 583
    :cond_0
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1

    .line 584
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 585
    const/16 v0, 0x19

    iput v0, p0, Lo/bvh;->f:I

    .line 586
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 587
    :cond_1
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x19

    if-ne v0, v1, :cond_2

    .line 588
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 589
    const/16 v0, 0x23

    iput v0, p0, Lo/bvh;->f:I

    .line 590
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 592
    :cond_2
    invoke-direct {p0}, Lo/bvh;->v()V

    .line 593
    :goto_0
    return-void
.end method

.method private x()V
    .locals 2

    .line 552
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x16

    if-ne v0, v1, :cond_1

    .line 553
    iget v0, p0, Lo/bvh;->n:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lo/bvh;->n:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 554
    const/4 v0, 0x3

    iput v0, p0, Lo/bvh;->f:I

    .line 556
    :cond_0
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 557
    :cond_1
    iget v0, p0, Lo/bvh;->f:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 558
    invoke-direct {p0}, Lo/bvh;->j()V

    goto :goto_0

    .line 560
    :cond_2
    invoke-direct {p0}, Lo/bvh;->y()V

    .line 561
    :goto_0
    return-void
.end method

.method private y()V
    .locals 4

    .line 564
    iget v0, p0, Lo/bvh;->f:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 565
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8981\u70b9\u8bed\u97f3\u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 567
    invoke-virtual {p0}, Lo/bvh;->c()Lo/bvx;

    .line 568
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "321go\u5f00\u59cb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 569
    :cond_0
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    .line 570
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 571
    invoke-virtual {p0}, Lo/bvh;->c()Lo/bvx;

    .line 572
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "321go\u5f00\u59cb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 574
    :cond_1
    invoke-direct {p0}, Lo/bvh;->w()V

    .line 575
    :goto_0
    return-void
.end method

.method private z()V
    .locals 2

    .line 541
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 542
    const/16 v0, 0x2a

    iput v0, p0, Lo/bvh;->f:I

    .line 543
    invoke-virtual {p0}, Lo/bvh;->n()Lo/bvz;

    goto :goto_0

    .line 544
    :cond_0
    iget v0, p0, Lo/bvh;->f:I

    const/16 v1, 0x2a

    if-ne v0, v1, :cond_1

    .line 545
    invoke-direct {p0}, Lo/bvh;->D()V

    goto :goto_0

    .line 548
    :cond_1
    invoke-direct {p0}, Lo/bvh;->x()V

    .line 549
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lo/bvx;
    .locals 4

    .line 188
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvh;->k:Z

    .line 189
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 192
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvh;->q:Z

    goto :goto_0

    .line 194
    :cond_0
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c\u5931\u8d25 , \u6ca1\u6709\u6b63\u5728\u64ad\u653e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvh;->q:Z

    .line 197
    :goto_0
    return-object p0
.end method

.method public a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;
    .locals 5

    .line 224
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e\u7b2c\u4e00\u4e2a\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    const/4 v0, 0x0

    iput v0, p0, Lo/bvh;->f:I

    .line 226
    iput-object p1, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 228
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E002"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 229
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 230
    return-object p0
.end method

.method public b()Lo/bvx;
    .locals 4

    .line 208
    iget-boolean v0, p0, Lo/bvh;->k:Z

    if-eqz v0, :cond_1

    .line 209
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvh;->k:Z

    .line 210
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7ee7\u7eed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/bvh;->q:Z

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    goto :goto_0

    .line 214
    :cond_0
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u624b\u52a8\u7ee7\u7eed\u4e0b\u4e00\u4e2a\u6307\u5bfc\u8bed\u97f3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    invoke-virtual {p0, v0}, Lo/bvh;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 219
    :cond_1
    :goto_0
    return-object p0
.end method

.method public b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;
    .locals 5

    .line 436
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvh;->k:Z

    .line 437
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u4e0a\u4e00\u4e2a\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    const/16 v0, 0x9

    iput v0, p0, Lo/bvh;->f:I

    .line 439
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 440
    iput-object p1, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 442
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E205"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 443
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 445
    :cond_0
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/bvx;
    .locals 4

    .line 235
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u64ad\u653e \u52a8\u4f5c\u540d\u5b57"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 237
    const/4 v0, 0x1

    iput v0, p0, Lo/bvh;->f:I

    .line 238
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 239
    invoke-direct {p0, p1}, Lo/bvh;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    goto :goto_0

    .line 242
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".mp3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 244
    :goto_0
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 246
    :cond_1
    return-object p0
.end method

.method public varargs b([Ljava/lang/String;)Lo/bvz;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 161
    invoke-super {p0, p1}, Lo/bvu;->b([Ljava/lang/String;)Lo/bvz;

    .line 162
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 163
    return-object p0
.end method

.method public c()Lo/bvx;
    .locals 4

    .line 342
    const/4 v0, 0x5

    iput v0, p0, Lo/bvh;->f:I

    .line 343
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e 321GO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 345
    iget-object v0, p0, Lo/bvh;->o:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bvh;->e(Ljava/util/List;)Lo/bvz;

    .line 346
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 348
    :cond_0
    return-object p0
.end method

.method public c(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;
    .locals 5

    .line 422
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvh;->k:Z

    .line 423
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u4e0b\u4e00\u4e2a\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    const/16 v0, 0x9

    iput v0, p0, Lo/bvh;->f:I

    .line 425
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 426
    iput-object p1, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 428
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E019"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 429
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 431
    :cond_0
    return-object p0
.end method

.method public c(I)V
    .locals 0

    .line 726
    invoke-super {p0, p1}, Lo/bvu;->c(I)V

    .line 727
    invoke-direct {p0}, Lo/bvh;->I()V

    .line 728
    return-void
.end method

.method public d(I)Lo/bvx;
    .locals 6

    .line 365
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u4f11\u606f\u7ed3\u675f \u4e0b\u4e00\u7ec4\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    const/4 v0, 0x0

    iput v0, p0, Lo/bvh;->h:I

    .line 367
    const/4 v0, 0x1

    iput v0, p0, Lo/bvh;->p:I

    .line 368
    const/4 v0, 0x7

    iput v0, p0, Lo/bvh;->f:I

    .line 369
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 370
    iget-object v0, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 371
    const/4 v0, 0x2

    iput v0, p0, Lo/bvh;->h:I

    .line 373
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E009"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/bvh;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 374
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    goto :goto_0

    .line 376
    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Lo/bvh;->h:I

    .line 377
    new-instance v5, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 379
    const-string v0, "E009"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 382
    const-string v0, "E022"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 383
    invoke-virtual {p0, p1}, Lo/bvh;->k(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 385
    const-string v0, "C001"

    iget-object v1, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    invoke-virtual {p0, v5}, Lo/bvh;->e(Ljava/util/List;)Lo/bvz;

    .line 387
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 390
    :cond_1
    :goto_0
    return-object p0
.end method

.method public d(II)Lo/bvx;
    .locals 4

    .line 255
    const/4 v0, 0x2

    iput v0, p0, Lo/bvh;->f:I

    .line 256
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u51e0\u7ec4\u51e0\u6b21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 258
    invoke-direct {p0, p1, p2}, Lo/bvh;->e(II)V

    .line 260
    :cond_0
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/bvx;
    .locals 4

    .line 332
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u8bad\u7ec3\u8981\u70b9"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 334
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 335
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 337
    :cond_0
    return-object p0
.end method

.method public e()Lo/bvx;
    .locals 5

    .line 353
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u4f11\u606f\u4e00\u4e0b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    const/4 v0, 0x6

    iput v0, p0, Lo/bvh;->f:I

    .line 355
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 357
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E008"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 358
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 360
    :cond_0
    return-object p0
.end method

.method public e(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;
    .locals 5

    .line 450
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u6700\u540e\u4e00\u4e2a\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const/16 v0, 0x9

    iput v0, p0, Lo/bvh;->f:I

    .line 452
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 453
    iput-object p1, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 456
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E065"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 457
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 459
    :cond_0
    return-object p0
.end method

.method public e(ZLcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;
    .locals 5

    .line 399
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u4f11\u606f\u7ed3\u675f \u4e0b\u4e00\u4e2a\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    if-eqz p1, :cond_0

    .line 401
    const/16 v0, 0x11

    iput v0, p0, Lo/bvh;->f:I

    goto :goto_0

    .line 403
    :cond_0
    const/16 v0, 0x1b

    iput v0, p0, Lo/bvh;->f:I

    .line 405
    :goto_0
    iput-object p2, p0, Lo/bvh;->m:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 406
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 408
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E009"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 409
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 411
    :cond_1
    return-object p0
.end method

.method public g()Lo/bvx;
    .locals 5

    .line 464
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    const/4 v0, -0x1

    iput v0, p0, Lo/bvh;->f:I

    .line 467
    iget-object v0, p0, Lo/bvh;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 468
    const/4 v0, 0x1

    iput v0, p0, Lo/bvh;->a:I

    .line 470
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 472
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "E068"

    iget-object v2, p0, Lo/bvh;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bvh;->b:Ljava/lang/String;

    const-string v4, ".mp3"

    invoke-static {v1, v2, v3, v4}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lo/bvh;->b([Ljava/lang/String;)Lo/bvz;

    .line 473
    invoke-virtual {p0}, Lo/bvh;->i()Lo/bvz;

    .line 475
    :cond_0
    return-object p0
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 4

    .line 505
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-------onCompletion---------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    iget-boolean v0, p0, Lo/bvh;->k:Z

    if-nez v0, :cond_0

    .line 507
    invoke-direct {p0}, Lo/bvh;->h()V

    goto :goto_0

    .line 511
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvh;->q:Z

    .line 513
    :goto_0
    iget v0, p0, Lo/bvh;->a:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 514
    iget-object v0, p0, Lo/bvh;->g:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53d1\u9001\u6d88\u606f-----\u606d\u559c\u4f60\u8bad\u7ec3\u5b8c\u6210"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lo/bvh;->r:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 516
    const/4 v0, 0x0

    iput v0, p0, Lo/bvh;->a:I

    .line 518
    :cond_1
    return-void
.end method
