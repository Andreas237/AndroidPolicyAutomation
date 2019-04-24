.class Lo/esm$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/esm;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/esm;)V
    .locals 1

    .line 88
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 89
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/esm$a;->a:Ljava/lang/ref/WeakReference;

    .line 90
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 94
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 96
    iget-object v0, p0, Lo/esm$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/esm;

    .line 97
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 98
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyCardMapImageHander sportsRecordingCard is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void

    .line 101
    :cond_0
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 102
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyCardMapImageHander sportsRecordingCard.mPreviewCardViewHolder is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return-void

    .line 105
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 108
    :pswitch_0
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage: \u6709\u8bad\u7ec3\u56fe"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/graphics/Bitmap;

    .line 110
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    iget-object v0, v0, Lo/esq;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 111
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    iget-object v0, v0, Lo/esq;->g:Landroid/view/View;

    iget-object v1, v4, Lo/esm;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_sports_card_background2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 112
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    iget-object v0, v0, Lo/esq;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 113
    goto :goto_1

    .line 116
    :pswitch_1
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage: \u65e0\u8bad\u7ec3\u56fe\u754c\u9762"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-static {v4}, Lo/esm;->a(Lo/esm;)V

    .line 118
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    iget-object v0, v0, Lo/esq;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    goto :goto_1

    .line 122
    :pswitch_2
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage: show RedDot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    iget-object v0, v0, Lo/esq;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 124
    goto :goto_1

    .line 127
    :pswitch_3
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage: not show RedDot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-static {v4}, Lo/esm;->b(Lo/esm;)Lo/esq;

    move-result-object v0

    iget-object v0, v0, Lo/esq;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 129
    goto :goto_1

    .line 131
    :goto_0
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportsRecordingCard Handler Msg err no action doing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method
