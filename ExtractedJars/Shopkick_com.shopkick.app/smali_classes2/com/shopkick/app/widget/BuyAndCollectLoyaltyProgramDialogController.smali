.class public Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;
.super Ljava/lang/Object;
.source "BuyAndCollectLoyaltyProgramDialogController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;
    }
.end annotation


# static fields
.field public static final CLOSE_BUTTON:I = 0x3

.field public static final MASTERCARD_BUTTON:I = 0x2

.field public static final VISA_BUTTON:I = 0x1


# instance fields
.field activity:Landroid/app/Activity;

.field callback:Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

.field canEnrollMC:Z

.field canEnrollVisa:Z

.field cancelListener:Landroid/content/DialogInterface$OnCancelListener;

.field customDialog:Landroid/app/Dialog;

.field enabledLoyaltyProgramIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

.field private userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/shopkick/app/application/ClientFlagsManager;ZZLcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance v0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$1;-><init>(Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->cancelListener:Landroid/content/DialogInterface$OnCancelListener;

    .line 49
    iput-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->activity:Landroid/app/Activity;

    .line 50
    iget-object p1, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enabledBuyAndCollectProgramIds:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->enabledLoyaltyProgramIds:Ljava/util/List;

    .line 51
    iput-object p5, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->callback:Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

    .line 52
    iput-boolean p3, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->canEnrollVisa:Z

    .line 53
    iput-boolean p4, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->canEnrollMC:Z

    .line 54
    iput-object p6, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 58
    invoke-virtual {p6}, Lcom/shopkick/app/logging/UserEventLogger;->getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-result-object p1

    if-nez p1, :cond_0

    .line 59
    new-instance p1, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {p1}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p2, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 62
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->buildDialog()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->cleanup()V

    return-void
.end method

.method private buildDialog()V
    .locals 12

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->activity:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c0057

    .line 67
    invoke-virtual {v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v2, 0x7f090815

    .line 69
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKButton;

    const v3, 0x7f09046d

    .line 70
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKButton;

    .line 72
    iget-boolean v4, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->canEnrollVisa:Z

    const/16 v5, 0x11

    const v6, 0x7f090816

    const/4 v7, 0x1

    const/16 v8, 0x8

    const/4 v9, 0x0

    if-eqz v4, :cond_0

    .line 74
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v10, 0x19

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-direct {v4, v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 75
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v4, v10}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLoyaltyProgramId(Ljava/lang/Integer;)V

    .line 76
    new-instance v10, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v10}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 77
    iget-object v11, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    iput-object v11, v10, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 78
    iget-object v11, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v4, v11, v10}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 80
    new-instance v4, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;

    iget-object v10, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->callback:Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

    invoke-direct {v4, v10, v7}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;-><init>(Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;I)V

    invoke-virtual {v2, v4}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    invoke-virtual {v2, v7}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    const v4, 0x7f0800ca

    .line 83
    invoke-virtual {v2, v4}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    .line 84
    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    invoke-virtual {v2, v9}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    const v4, 0x7f0800cb

    .line 88
    invoke-virtual {v2, v4}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    .line 89
    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 92
    :goto_0
    iget-boolean v2, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->canEnrollMC:Z

    const v4, 0x7f09046e

    if-eqz v2, :cond_1

    .line 94
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x1a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v1, v2, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v2, 0xa

    .line 95
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLoyaltyProgramId(Ljava/lang/Integer;)V

    .line 96
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 97
    iget-object v5, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    iput-object v5, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 98
    iget-object v5, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v1, v5, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 100
    new-instance v1, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;

    iget-object v2, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->callback:Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

    const/4 v5, 0x2

    invoke-direct {v1, v2, v5}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;-><init>(Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;I)V

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    invoke-virtual {v3, v7}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    const v1, 0x7f0800c8

    .line 103
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    .line 104
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 106
    :cond_1
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    invoke-virtual {v3, v9}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    const v1, 0x7f0800c9

    .line 108
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    .line 109
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 112
    :goto_1
    new-instance v1, Lcom/shopkick/app/widget/BottomSheetDialog;

    iget-object v2, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->activity:Landroid/app/Activity;

    iget-object v3, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->cancelListener:Landroid/content/DialogInterface$OnCancelListener;

    invoke-direct {v1, v2, v0, v3}, Lcom/shopkick/app/widget/BottomSheetDialog;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/content/DialogInterface$OnCancelListener;)V

    iput-object v1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    return-void
.end method

.method private cleanup()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    .line 143
    iput-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->removeUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 127
    invoke-direct {p0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->cleanup()V

    :cond_0
    return-void
.end method

.method public dismissDialog()V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 121
    invoke-direct {p0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->cleanup()V

    :cond_0
    return-void
.end method

.method public showDialog()V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->customDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
