.class Lcom/shopkick/app/account/EditProfileScreen$6;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


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

    .line 344
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 1

    .line 348
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1, p2, p3, p4}, Lcom/shopkick/app/account/EditProfileScreen;->access$300(Lcom/shopkick/app/account/EditProfileScreen;III)Ljava/lang/String;

    move-result-object p1

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->birthdateText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 351
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1, p2, p3, p4}, Ljava/util/Calendar;->set(III)V

    .line 352
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->c:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/DateUtils;->dateToString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    goto :goto_0

    .line 356
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->birthdate:Ljava/lang/String;

    .line 358
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const/4 v0, 0x1

    .line 359
    invoke-virtual {p1, v0, p2}, Ljava/util/Calendar;->set(II)V

    const/4 p2, 0x2

    .line 360
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    const/4 p2, 0x5

    .line 361
    invoke-virtual {p1, p2, p4}, Ljava/util/Calendar;->set(II)V

    .line 362
    iget-object p2, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$400(Lcom/shopkick/app/account/EditProfileScreen;Ljava/util/Date;)V

    .line 363
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$6;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$200(Lcom/shopkick/app/account/EditProfileScreen;)V

    return-void
.end method
