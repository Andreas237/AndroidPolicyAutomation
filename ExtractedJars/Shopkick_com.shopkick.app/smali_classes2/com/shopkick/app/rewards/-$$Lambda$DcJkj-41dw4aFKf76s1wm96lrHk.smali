.class public final synthetic Lcom/shopkick/app/rewards/-$$Lambda$DcJkj-41dw4aFKf76s1wm96lrHk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/-$$Lambda$DcJkj-41dw4aFKf76s1wm96lrHk;->f$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/rewards/-$$Lambda$DcJkj-41dw4aFKf76s1wm96lrHk;->f$0:Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    return-void
.end method
