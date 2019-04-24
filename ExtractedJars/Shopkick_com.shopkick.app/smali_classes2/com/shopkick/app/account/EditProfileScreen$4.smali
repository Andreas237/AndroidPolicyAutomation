.class Lcom/shopkick/app/account/EditProfileScreen$4;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EditProfileScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/EditProfileScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/EditProfileScreen;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-boolean v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    if-eqz v0, :cond_0

    return-void

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    .line 299
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    .line 300
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 302
    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v3, v3, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 304
    iget-object v5, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v5, v5, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v5, v5, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v5, v5, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v5, v5, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v5, v5, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v5, v5, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    .line 305
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    .line 306
    iget-object v5, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v5, v5, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v5, v5, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {v5}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 308
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    .line 309
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 310
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 312
    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v2, v2, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 315
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v2, v2, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {v2, p1, v0, v3}, Landroid/app/DatePickerDialog;->updateDate(III)V

    .line 316
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->datePickerDialog:Landroid/app/DatePickerDialog;

    invoke-virtual {p1}, Landroid/app/DatePickerDialog;->show()V

    goto :goto_0

    .line 317
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_3

    const-string/jumbo p1, "test"

    const-string v0, "clicked"

    .line 318
    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/account/EditProfileScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const-string v2, ""

    iget-object v3, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    .line 321
    invoke-virtual {v3}, Lcom/shopkick/app/account/EditProfileScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1101b5

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 319
    invoke-static {v0, v2, v3, v1, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/account/EditProfileScreen;->savingProfileDialog:Landroid/app/ProgressDialog;

    .line 324
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v2, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-virtual {p1, v0, v2}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 325
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-boolean p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->birthdateChanged:Z

    if-eqz p1, :cond_3

    .line 326
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->saveButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->triggerEvent()V

    .line 330
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$4;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iput-boolean v1, p1, Lcom/shopkick/app/account/EditProfileScreen;->buttonTapped:Z

    return-void
.end method
