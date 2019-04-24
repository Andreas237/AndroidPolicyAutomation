.class public Lcom/shopkick/app/account/EmailVerificationController;
.super Ljava/lang/Object;
.source "EmailVerificationController.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;,
        Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;,
        Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;
    }
.end annotation


# instance fields
.field private activity:Landroid/app/Activity;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private code:Ljava/lang/String;

.field private emailAddress:Ljava/lang/String;

.field private emailVerificationId:Ljava/lang/Long;

.field private emailVerifySendRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;

.field private emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

.field private emailVerifyValidationRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;

.field private mainView:Landroid/view/View;

.field private modalButtonAction:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p2, p0, Lcom/shopkick/app/account/EmailVerificationController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 57
    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/EmailVerificationController;)Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/account/EmailVerificationController;->modalButtonAction:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/account/EmailVerificationController;Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;)Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->modalButtonAction:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/EmailVerificationController;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/account/EmailVerificationController;->dismissModalView()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/EmailVerificationController;)Ljava/lang/String;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/account/EmailVerificationController;->userId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/EmailVerificationController;)Ljava/lang/String;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailAddress:Ljava/lang/String;

    return-object p0
.end method

.method private dismissModalView()V
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 100
    iput-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    return-void
.end method

.method private handleCompletedEmailVerifySendRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 257
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_2

    .line 258
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendResponse;

    .line 259
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendResponse;->message:Ljava/lang/String;

    .line 260
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 263
    :cond_0
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    goto :goto_1

    .line 261
    :cond_1
    :goto_0
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->SUCCESS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    goto :goto_1

    .line 266
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    const v0, 0x7f110142

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 267
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    .line 270
    :goto_1
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/EmailVerificationController;->showEmailVerificationModalForStatus(Ljava/lang/String;)V

    return-void
.end method

.method private handleCompletedEmailVerifyValidationRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 232
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_4

    .line 233
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;

    .line 234
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->userId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->userId:Ljava/lang/String;

    .line 235
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->email:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailAddress:Ljava/lang/String;

    .line 236
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->message:Ljava/lang/String;

    .line 237
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->status:Ljava/lang/Integer;

    .line 238
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 240
    :cond_0
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationResponse;->status:Ljava/lang/Integer;

    .line 241
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_1

    goto :goto_0

    .line 244
    :cond_1
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->RESEND:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    goto :goto_2

    .line 242
    :cond_2
    :goto_0
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    goto :goto_2

    .line 239
    :cond_3
    :goto_1
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->SUCCESS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    goto :goto_2

    .line 247
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    const v0, 0x7f110142

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 248
    sget-object p1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    .line 251
    :goto_2
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/EmailVerificationController;->showEmailVerificationModalForStatus(Ljava/lang/String;)V

    return-void
.end method

.method private setUpModalView()V
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00ac

    const/4 v2, 0x0

    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method private showEmailVerificationModalForStatus(Ljava/lang/String;)V
    .locals 11

    .line 141
    invoke-direct {p0}, Lcom/shopkick/app/account/EmailVerificationController;->setUpModalView()V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v1, 0x7f0906bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    .line 144
    iget-object v1, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v2, 0x7f090254

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 145
    iget-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v3, 0x7f090767

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    .line 146
    iget-object v3, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v4, 0x7f090476

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 147
    iget-object v4, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v5, 0x7f090236

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    .line 148
    iget-object v5, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v6, 0x7f0900b8

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/widget/SKButton;

    .line 156
    sget-object v6, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$EmailVerifyStatus:[I

    iget-object v7, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    invoke-virtual {v7}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const v7, 0x7f110299

    const v8, 0x7f08014e

    const v9, 0x7f06015d

    const v10, 0x7f080095

    packed-switch v6, :pswitch_data_0

    goto :goto_0

    .line 174
    :pswitch_0
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 175
    invoke-virtual {v2, v7}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 176
    invoke-virtual {v5, v10}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    .line 177
    iget-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonTextColor(I)V

    const v2, 0x7f110298

    .line 178
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 179
    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->SEND_EMAIL:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    iput-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->modalButtonAction:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    goto :goto_0

    .line 166
    :pswitch_1
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 167
    invoke-virtual {v2, v7}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    const v2, 0x7f080194

    .line 168
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    const v2, 0x7f060120

    .line 169
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonTextColor(I)V

    const v2, 0x7f110297

    .line 170
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 171
    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    iput-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->modalButtonAction:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    goto :goto_0

    :pswitch_2
    const v6, 0x7f08014f

    .line 158
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackgroundResource(I)V

    const v6, 0x7f11029d

    .line 159
    invoke-virtual {v2, v6}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 160
    invoke-virtual {v5, v10}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    .line 161
    iget-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonTextColor(I)V

    const v2, 0x7f11029c

    .line 162
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 163
    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    iput-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->modalButtonAction:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    :goto_0
    const/4 v2, 0x0

    .line 186
    iput-object v2, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyStatus:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    const/4 v2, 0x4

    .line 189
    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const/4 v0, 0x0

    .line 190
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 193
    invoke-virtual {v3, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 194
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailAddress:Ljava/lang/String;

    invoke-virtual {v4, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 197
    invoke-virtual {v5, p1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 198
    invoke-virtual {v5}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 199
    new-instance p1, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;

    invoke-direct {p1, p0}, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;-><init>(Lcom/shopkick/app/account/EmailVerificationController;)V

    invoke-virtual {v5, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private showEmailVerificationModalLoading(I)V
    .locals 3

    .line 112
    invoke-direct {p0}, Lcom/shopkick/app/account/EmailVerificationController;->setUpModalView()V

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v1, 0x7f0906bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    .line 116
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v2, 0x7f090254

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x4

    .line 119
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v2, 0x7f090767

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 123
    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v0, 0x7f090476

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x0

    .line 127
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v0, 0x7f090236

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailAddress:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->mainView:Landroid/view/View;

    const v0, 0x7f0900b8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f110141

    .line 135
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 136
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 137
    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x4d

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyValidationRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 282
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/EmailVerificationController;->handleCompletedEmailVerifyValidationRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 283
    iput-object v1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyValidationRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;

    goto :goto_0

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifySendRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;

    if-ne p1, v0, :cond_1

    .line 285
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/EmailVerificationController;->handleCompletedEmailVerifySendRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 286
    iput-object v1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifySendRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;

    :cond_1
    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public sendEmailVerification(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Param userId should not be null"

    .line 81
    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v1, "Param email should not be null"

    .line 82
    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 85
    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->userId:Ljava/lang/String;

    .line 86
    iput-object p2, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailAddress:Ljava/lang/String;

    const v0, 0x7f11029a

    .line 89
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/EmailVerificationController;->showEmailVerificationModalLoading(I)V

    .line 92
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifySendRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifySendRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;->userId:Ljava/lang/String;

    .line 94
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifySendRequest;->email:Ljava/lang/String;

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public validateEmailVerification(Ljava/lang/Long;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Param emailVerificationId should not be null"

    .line 62
    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v1, "Param code should not be null"

    .line 63
    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 66
    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerificationId:Ljava/lang/Long;

    .line 67
    iput-object p2, p0, Lcom/shopkick/app/account/EmailVerificationController;->code:Ljava/lang/String;

    const v0, 0x7f11029b

    .line 70
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/EmailVerificationController;->showEmailVerificationModalLoading(I)V

    .line 73
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyValidationRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController;->emailVerifyValidationRequest:Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;->emailVerificationId:Ljava/lang/Long;

    .line 75
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/EmailVerifyValidationRequest;->code:Ljava/lang/String;

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method
