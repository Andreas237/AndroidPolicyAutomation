.class public Lo/boy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/sns/model/group/GroupMember;Z)Landroid/graphics/Bitmap;
    .locals 6

    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz p1, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    .line 49
    invoke-static {v0, v1, v2, v3, v4}, Lo/bbk;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-static {v0, v1, v2, v3, v4}, Lo/bbn;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 57
    :goto_0
    return-object v5
.end method

.method public static a(Z)Landroid/graphics/Bitmap;
    .locals 3

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {}, Lo/bbq;->d()I

    move-result v2

    .line 29
    if-nez p0, :cond_0

    .line 31
    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_cloudsetting_default_head_img:I

    .line 33
    :cond_0
    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 34
    return-object v1
.end method

.method public static a(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz p1, :cond_0

    .line 93
    invoke-static {p0}, Lo/bbk;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0

    .line 97
    :cond_0
    invoke-static {p0}, Lo/bbn;->d(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 100
    :goto_0
    return-object v1
.end method

.method public static d(Lcom/huawei/health/sns/model/group/Group;Z)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 112
    const/4 v5, 0x0

    .line 113
    if-eqz p1, :cond_0

    .line 115
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 116
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    .line 115
    invoke-static {v0, v1, v2, v3, v4}, Lo/bbk;->b(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 121
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-static {v0, v1, v2, v3, v4}, Lo/bbn;->e(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 123
    :goto_0
    return-object v5
.end method

.method public static e(Landroid/widget/ImageView;Lo/ayc;Z)V
    .locals 6

    .line 69
    if-eqz p2, :cond_0

    .line 71
    invoke-virtual {p1}, Lo/ayc;->e()J

    move-result-wide v0

    move-object v2, p0

    invoke-virtual {p1}, Lo/ayc;->b()Ljava/lang/String;

    move-result-object v3

    .line 72
    invoke-virtual {p1}, Lo/ayc;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lo/ayc;->c()Ljava/lang/String;

    move-result-object v5

    .line 71
    invoke-static/range {v0 .. v5}, Lo/bbk;->a(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1}, Lo/ayc;->e()J

    move-result-wide v0

    move-object v2, p0

    invoke-virtual {p1}, Lo/ayc;->b()Ljava/lang/String;

    move-result-object v3

    .line 77
    invoke-virtual {p1}, Lo/ayc;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lo/ayc;->c()Ljava/lang/String;

    move-result-object v5

    .line 76
    invoke-static/range {v0 .. v5}, Lo/bbn;->e(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V
    .locals 0

    .line 135
    if-eqz p2, :cond_0

    .line 137
    invoke-static {p0, p1}, Lo/bbk;->c(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 141
    :cond_0
    invoke-static {p0, p1}, Lo/bbn;->b(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 143
    :goto_0
    return-void
.end method
