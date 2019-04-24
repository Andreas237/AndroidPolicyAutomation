.class public Lo/agf;
.super Lo/aft;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aft<Landroid/app/Activity;>;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private d:Landroid/widget/ImageView;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/Object;ILandroid/widget/ImageView;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Ljava/lang/Object;ILandroid/widget/ImageView;Ljava/util/ArrayList<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1}, Lo/aft;-><init>(Ljava/lang/Object;)V

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lo/agf;->a:I

    .line 24
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/agf;->b:Ljava/lang/Object;

    .line 26
    const/16 v0, 0x5dc

    iput v0, p0, Lo/agf;->e:I

    .line 36
    iput-object p5, p0, Lo/agf;->c:Ljava/util/ArrayList;

    .line 38
    iput-object p4, p0, Lo/agf;->d:Landroid/widget/ImageView;

    .line 40
    iput p3, p0, Lo/agf;->a:I

    .line 42
    iput-object p2, p0, Lo/agf;->b:Ljava/lang/Object;

    .line 43
    return-void
.end method

.method private a()V
    .locals 3

    .line 61
    iget-object v0, p0, Lo/agf;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/agf;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 63
    :cond_0
    return-void

    .line 66
    :cond_1
    iget-object v0, p0, Lo/agf;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lo/agf;->a:I

    if-ne v0, v1, :cond_2

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lo/agf;->a:I

    .line 70
    :cond_2
    iget-object v0, p0, Lo/agf;->c:Ljava/util/ArrayList;

    iget v1, p0, Lo/agf;->a:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo/agf;->b:Ljava/lang/Object;

    .line 71
    iget v0, p0, Lo/agf;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/agf;->a:I

    .line 79
    iget-object v0, p0, Lo/agf;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    .line 80
    iget-object v0, p0, Lo/agf;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 81
    iget-object v0, p0, Lo/agf;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agf;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 83
    :cond_3
    iget-object v0, p0, Lo/agf;->b:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 84
    iget-object v0, p0, Lo/agf;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agf;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 88
    :cond_4
    iget v0, p0, Lo/agf;->e:I

    int-to-long v0, v0

    const/16 v2, 0x3e2

    invoke-virtual {p0, v2, v0, v1}, Lo/agf;->sendEmptyMessageDelayed(IJ)Z

    .line 89
    return-void
.end method


# virtual methods
.method protected c(Landroid/app/Activity;Landroid/os/Message;)V
    .locals 1

    .line 48
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 51
    :sswitch_0
    invoke-direct {p0}, Lo/agf;->a()V

    .line 52
    .line 57
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e2 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(I)V
    .locals 0

    .line 29
    iput p1, p0, Lo/agf;->e:I

    .line 30
    return-void
.end method

.method protected synthetic e(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 16
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0, p2}, Lo/agf;->c(Landroid/app/Activity;Landroid/os/Message;)V

    return-void
.end method
