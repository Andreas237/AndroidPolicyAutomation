.class public Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "BCEnrollmentHandler.java"

# interfaces
.implements Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "launch_buy_and_collect"

.field private static final MODE_DETAILS:Ljava/lang/String; = "Details"

.field private static final MODE_DETAILS_DIRECT:Ljava/lang/String; = "DetailsDirect"

.field private static final MODE_PROMO:Ljava/lang/String; = "Promo"

.field private static final MODE_PROMO_DIRECT:Ljava/lang/String; = "PromoDirect"

.field private static final PARAM_LOYALTY_PROG_ID:Ljava/lang/String; = "loyalty_program_id"

.field private static final PARAM_MODE:Ljava/lang/String; = "mode"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 42
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 43
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->isAsync:Z

    return-void
.end method

.method private goToScreen(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)V"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 140
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/BncActivity;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 141
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method


# virtual methods
.method public buttonTapped(I)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->dismissDialog()V

    const/4 v0, 0x0

    .line 124
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 131
    const-class p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0, p1}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->goToScreen(Ljava/lang/Class;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 133
    const-class p1, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;

    invoke-direct {p0, p1}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->goToScreen(Ljava/lang/Class;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 55
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->destroy()V

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 4

    .line 50
    new-instance v0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 21
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public dialogCanceled()V
    .locals 1

    const/4 v0, 0x0

    .line 146
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    return-void
.end method

.method public execute()V
    .locals 8

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->params:Ljava/util/Map;

    const-string v1, "mode"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    const-string/jumbo v0, "settings"

    goto :goto_0

    :cond_1
    const-string v1, "Promo"

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "promo"

    goto :goto_0

    :cond_2
    const-string v1, "PromoDirect"

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "promo_direct"

    goto :goto_0

    :cond_3
    const-string v1, "Details"

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v0, "details"

    goto :goto_0

    :cond_4
    const-string v1, "DetailsDirect"

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "details_direct"

    goto :goto_0

    :cond_5
    const-string/jumbo v0, "settings"

    .line 83
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->params:Ljava/util/Map;

    const-string v3, "loyalty_program_id"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_6
    move-object v1, v3

    :goto_1
    const-string v4, "details_direct"

    .line 89
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "promo_direct"

    .line 90
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    .line 113
    :cond_7
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v4, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;

    invoke-direct {v0, v1, v4, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 116
    invoke-virtual {v2, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    goto :goto_3

    :cond_8
    :goto_2
    if-eqz v1, :cond_a

    .line 94
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_9

    .line 95
    const-class v0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;

    invoke-direct {p0, v0}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->goToScreen(Ljava/lang/Class;)V

    goto :goto_3

    .line 96
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_c

    .line 97
    const-class v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0, v0}, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->goToScreen(Ljava/lang/Class;)V

    goto :goto_3

    .line 102
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-nez v0, :cond_b

    .line 103
    new-instance v0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const/4 v4, 0x1

    const/4 v5, 0x1

    .line 108
    invoke-virtual {v2}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    iget-object v7, v1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v1, v0

    move-object v6, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;-><init>(Landroid/app/Activity;Lcom/shopkick/app/application/ClientFlagsManager;ZZLcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 110
    :cond_b
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/BCEnrollmentHandler;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->showDialog()V

    :cond_c
    :goto_3
    return-void
.end method
