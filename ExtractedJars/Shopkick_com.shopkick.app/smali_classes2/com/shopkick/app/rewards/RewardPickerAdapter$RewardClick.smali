.class Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;
.super Ljava/lang/Object;
.source "RewardPickerAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardPickerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RewardClick"
.end annotation


# instance fields
.field private adapterRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardPickerAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private rewardMallId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/shopkick/app/rewards/RewardPickerAdapter;)V
    .locals 0

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;->rewardMallId:Ljava/lang/String;

    .line 231
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;->adapterRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;->adapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardPickerAdapter;

    if-nez v0, :cond_0

    return-void

    .line 239
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;->rewardMallId:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->access$000(Lcom/shopkick/app/rewards/RewardPickerAdapter;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
