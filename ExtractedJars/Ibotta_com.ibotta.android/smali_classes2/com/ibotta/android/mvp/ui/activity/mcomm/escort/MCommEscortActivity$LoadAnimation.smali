.class Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;
.super Ljava/lang/Object;
.source "MCommEscortActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoadAnimation"
.end annotation


# instance fields
.field private i:I

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 294
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->i:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$1;)V
    .locals 0

    .line 293
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;-><init>(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 298
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->i:I

    .line 299
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->i:I

    rem-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->i:I

    .line 301
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->i:I

    const v1, 0x7f0801d6

    const v2, 0x7f0801dd

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 313
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad1:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad2:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad3:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 308
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad1:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 309
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad2:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad3:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 303
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad1:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad2:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->ivLoad3:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 319
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity$LoadAnimation;->this$0:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
