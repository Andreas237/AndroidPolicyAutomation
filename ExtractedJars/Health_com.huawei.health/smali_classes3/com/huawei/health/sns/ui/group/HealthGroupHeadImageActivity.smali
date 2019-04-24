.class public Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$e;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/health/sns/model/group/Group;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/ImageView;

.field private d:Lo/egn;

.field private e:Landroid/widget/TextView;

.field private f:I

.field private g:Lo/egy;

.field private h:Landroid/os/Handler;

.field private i:Lo/emr;

.field private k:Lo/ems;

.field private l:Lo/ems$d;

.field private m:Landroid/content/Intent;

.field private n:Landroid/graphics/Bitmap;

.field private p:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 274
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    .line 278
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    .line 283
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    .line 297
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b:Landroid/widget/RelativeLayout;

    .line 314
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f:I

    .line 323
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$e;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h:Landroid/os/Handler;

    .line 512
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->l:Lo/ems$d;

    .line 715
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n:Landroid/graphics/Bitmap;

    return-void
.end method

.method private a()V
    .locals 4

    .line 496
    sget v0, Lcom/huawei/android/sns/R$id;->health_group_toolbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    .line 497
    sget v0, Lcom/huawei/android/sns/R$layout;->hw_toolbar_bottomview:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 498
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    invoke-virtual {v0, v3}, Lo/ems;->d(Landroid/view/View;)V

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->l:Lo/ems$d;

    invoke-virtual {v0, v1}, Lo/ems;->setOnSingleTapListener(Lo/ems$d;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_photo:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_capture:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_picture:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_album_pic_browser_sigle_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lo/ems;->setIconVisible(II)V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 510
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Z)V
    .locals 2

    .line 874
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h()V

    .line 875
    new-instance v1, Lo/ats;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h:Landroid/os/Handler;

    invoke-direct {v1, v0}, Lo/ats;-><init>(Landroid/os/Handler;)V

    .line 876
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1, v0, p1, p2}, Lo/ats;->b(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V

    .line 877
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Landroid/graphics/Bitmap;Z)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Landroid/graphics/Bitmap;Z)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/Object;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 10

    .line 885
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updataGroupPoster:path = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 886
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h()V

    .line 888
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 889
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 890
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 891
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Ljava/io/File;)[B

    move-result-object v5

    .line 892
    if-nez v5, :cond_0

    .line 893
    return-void

    .line 895
    :cond_0
    const-string v6, "image/jpeg"

    .line 896
    invoke-static {p1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 897
    if-eqz v7, :cond_1

    .line 898
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 900
    :cond_1
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updataGroupPoster contentType =\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    new-instance v8, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;

    invoke-direct {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;-><init>()V

    .line 903
    const/16 v0, 0x6f

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->setId(I)V

    .line 904
    invoke-static {p1}, Lo/aof;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->setContentMd5(Ljava/lang/String;)V

    .line 905
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->setContentSha256(Ljava/lang/String;)V

    .line 906
    array-length v0, v5

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->setContentLength(Ljava/lang/Long;)V

    .line 907
    invoke-virtual {v8, v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->setContentType(Ljava/lang/String;)V

    .line 908
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->setFileName(Ljava/lang/String;)V

    .line 909
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u83b7\u53d6\u6d77\u62a5\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 911
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthFileMetadata;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 912
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/String;)V

    invoke-static {v9, v4, v0}, Lo/anz;->d(Lorg/json/JSONArray;Ljava/io/File;Lo/aog;)V

    .line 939
    :cond_2
    return-void
.end method

.method private a(Ljava/io/File;)[B
    .locals 12

    .line 1010
    const/4 v4, 0x0

    .line 1011
    const/4 v5, 0x0

    .line 1013
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 1014
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 1015
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "file too big..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1016
    const/4 v8, 0x0

    .line 1035
    nop

    .line 1036
    .line 1040
    nop

    .line 1016
    .line 1038
    .line 1039
    return-object v8

    .line 1018
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 1019
    long-to-int v0, v6

    new-array v0, v0, [B

    move-object v5, v0

    .line 1020
    const/4 v8, 0x0

    .line 1021
    const/4 v9, 0x0

    .line 1022
    :goto_0
    array-length v0, v5

    if-ge v8, v0, :cond_1

    array-length v0, v5

    sub-int/2addr v0, v8

    .line 1023
    invoke-virtual {v4, v5, v8, v0}, Ljava/io/FileInputStream;->read([BII)I

    move-result v0

    move v9, v0

    if-ltz v0, :cond_1

    .line 1024
    add-int/2addr v8, v9

    goto :goto_0

    .line 1027
    :cond_1
    array-length v0, v5

    if-eq v8, v0, :cond_2

    .line 1028
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Could not completely read file!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Could not completely read file "

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1035
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 1036
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1040
    :cond_3
    goto :goto_2

    .line 1038
    :catch_0
    move-exception v6

    .line 1039
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    goto :goto_2

    .line 1031
    :catch_1
    move-exception v6

    .line 1032
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1035
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 1036
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 1040
    :cond_4
    goto :goto_2

    .line 1038
    :catch_2
    move-exception v6

    .line 1039
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    goto :goto_2

    .line 1034
    :catchall_0
    move-exception v10

    .line 1035
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 1036
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1040
    :cond_5
    goto :goto_1

    .line 1038
    :catch_3
    move-exception v11

    .line 1039
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    :goto_1
    throw v10

    .line 1042
    :goto_2
    return-object v5
.end method

.method private b()V
    .locals 5

    .line 437
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    .line 441
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 440
    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    .line 445
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 444
    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 448
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 451
    sget v0, Lcom/huawei/android/sns/R$id;->tv_group_please_upload_group_pic:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e:Landroid/widget/TextView;

    .line 454
    sget v0, Lcom/huawei/android/sns/R$id;->check_pic_tip_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b:Landroid/widget/RelativeLayout;

    .line 464
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a()V

    .line 466
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 468
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_group_upload_event_poster:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_image_head_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 474
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 479
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_family_group_image:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 482
    :cond_1
    invoke-static {}, Lo/bom;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 488
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 489
    invoke-static {p0}, Lo/bmo;->e(Landroid/content/Context;)I

    move-result v0

    invoke-static {p0}, Lo/bmo;->a(Landroid/content/Context;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 493
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;I)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/Object;)V
    .locals 2

    .line 843
    if-nez p1, :cond_0

    .line 844
    return-void

    .line 846
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 847
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 848
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 850
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d()V

    .line 851
    return-void
.end method

.method private c(Ljava/io/File;)Ljava/lang/String;
    .locals 9

    .line 985
    const/4 v4, 0x0

    .line 986
    const-string v5, ""

    .line 988
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 989
    invoke-static {v4}, Lo/bor;->b(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 994
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 995
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 999
    :cond_0
    goto :goto_1

    .line 997
    :catch_0
    move-exception v6

    .line 998
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    goto :goto_1

    .line 990
    :catch_1
    move-exception v6

    .line 991
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 994
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 995
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 999
    :cond_1
    goto :goto_1

    .line 997
    :catch_2
    move-exception v6

    .line 998
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    goto :goto_1

    .line 993
    :catchall_0
    move-exception v7

    .line 994
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 995
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 999
    :cond_2
    goto :goto_0

    .line 997
    :catch_3
    move-exception v8

    .line 998
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    :goto_0
    throw v7

    .line 1001
    :goto_1
    return-object v5
.end method

.method private c(Landroid/content/Intent;)V
    .locals 5

    .line 784
    const-string v0, "selectedId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 785
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 786
    new-instance v3, Lo/avb;

    invoke-direct {v3, p0}, Lo/avb;-><init>(Landroid/content/Context;)V

    .line 787
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/avb;->b(I)Landroid/net/Uri;

    move-result-object v4

    .line 788
    if-eqz v4, :cond_0

    .line 794
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Landroid/net/Uri;)V

    .line 799
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 2

    .line 858
    if-nez p1, :cond_0

    .line 859
    return-void

    .line 861
    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 862
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 863
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 865
    :cond_1
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1153
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1154
    const-string v0, "GROUP_IMAGE_REFRESH_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1155
    const-string v0, "groupImageUrl"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1156
    const-string v0, "groupImageDownloadUrl"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1157
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 1158
    return-void
.end method

.method private c()Z
    .locals 3

    .line 551
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 565
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hw_feedback_permission_guide_torage:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v2, v0}, Lo/bhq;->d(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Z
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Ljava/lang/String;
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 582
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_head.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 583
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 584
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v4

    .line 585
    const-string v0, "Group_HealthGroupHeadImageActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTempFile: Delete file result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 588
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    .line 590
    const-string v0, "Group_HealthGroupHeadImageActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTempFile: Delete tempCropFile result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    :cond_1
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 966
    new-instance v3, Lo/egy$b;

    invoke-direct {v3, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 967
    invoke-virtual {v3, p1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$6;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 968
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 976
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g:Lo/egy;

    .line 977
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 978
    return-void
.end method

.method private d(III)V
    .locals 1

    .line 1053
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 1055
    :sswitch_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_file_parse_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1056
    goto :goto_0

    .line 1059
    :sswitch_1
    invoke-static {p2, p3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1060
    .line 1064
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1a1 -> :sswitch_0
        0x1a2 -> :sswitch_1
        0xaaa -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Landroid/content/Intent;)V
    .locals 4

    .line 760
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    .line 761
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 760
    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 762
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 763
    if-eqz p1, :cond_1

    .line 764
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 765
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 766
    if-eqz v3, :cond_1

    .line 767
    const-string v0, "data"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n:Landroid/graphics/Bitmap;

    .line 768
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 769
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 771
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 781
    :cond_1
    return-void
.end method

.method private d(Landroid/net/Uri;)V
    .locals 6

    .line 609
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.android.camera.action.CROP"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 610
    const-string v0, "image/*"

    invoke-virtual {v2, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 612
    const-string v0, "crop"

    const-string v1, "true"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 614
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 617
    const-string v0, "aspectX"

    const/16 v1, 0x5a

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 618
    const-string v0, "aspectY"

    const/16 v1, 0x3d

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 623
    const-string v0, "outputX"

    const/16 v1, 0x438

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 624
    const-string v0, "outputY"

    const/16 v1, 0x2dc

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 625
    const-string v0, "return-data"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 626
    const-string v0, "noFaceDetection"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 629
    const-string v0, "outputX"

    const/16 v1, 0x438

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 630
    const-string v0, "outputY"

    const/16 v1, 0x2dc

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 631
    const-string v0, "scale"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    .line 635
    :cond_0
    const-string v0, "aspectX"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 636
    const-string v0, "aspectY"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 639
    const-string v0, "outputX"

    const/16 v1, 0x12c

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 640
    const-string v0, "outputY"

    const/16 v1, 0x12c

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 641
    const-string v0, "return-data"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 642
    const-string v0, "noFaceDetection"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 645
    const-string v0, "outputX"

    const/16 v1, 0x438

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 646
    const-string v0, "outputY"

    const/16 v1, 0x438

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 647
    const-string v0, "scale"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 650
    :goto_0
    new-instance v3, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 651
    const/4 v4, 0x0

    .line 654
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 659
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 660
    const-string v0, "output"

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 662
    const-string v0, "outputFormat"

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 663
    const-string v0, "return-data"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 666
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 667
    const-string v0, "com.android.gallery3d"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 670
    :cond_1
    const/4 v0, 0x4

    :try_start_0
    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 673
    goto :goto_1

    .line 671
    :catch_0
    move-exception v5

    .line 672
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const-string v1, "crop picture not found "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/Object;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 1144
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 1145
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1146
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->finish()V

    .line 1147
    return-void
.end method

.method private e()Ljava/io/File;
    .locals 2

    .line 575
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_head.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private e(I)V
    .locals 2

    .line 946
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 947
    const/16 v0, 0x1a8

    iput v0, v1, Landroid/os/Message;->what:I

    .line 948
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 950
    :sswitch_0
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_avatar_over_limit:I

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 951
    goto :goto_1

    .line 953
    :sswitch_1
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_create_max:I

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 954
    goto :goto_1

    .line 956
    :sswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_update_server_error:I

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 957
    goto :goto_1

    .line 959
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hw_toast_log_upload_failed:I

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 962
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 963
    return-void

    :sswitch_data_0
    .sparse-switch
        0x270f -> :sswitch_2
        0x69db9c6 -> :sswitch_0
        0x69db9c7 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;I)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;III)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(III)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/String;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Lo/egy;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g:Lo/egy;

    return-object v0
.end method

.method private f()V
    .locals 5

    .line 1110
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f:I

    if-nez v0, :cond_4

    .line 1111
    const-string v3, ""

    .line 1112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 1114
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1115
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 1116
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1117
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 1119
    :cond_2
    :goto_0
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p:Landroid/content/Context;

    const/high16 v1, 0x432a0000    # 170.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p:Landroid/content/Context;

    const/high16 v2, 0x432a0000    # 170.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v4, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1120
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1124
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 1128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 1130
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1131
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_image_head_round_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1134
    :cond_4
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method private g()Ljava/lang/String;
    .locals 2

    .line 600
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "sns_temp.jpg"

    invoke-virtual {v0, v1}, Lo/bbh;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/graphics/Bitmap;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 1070
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1071
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1072
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    .line 1073
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1074
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 1075
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1077
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1078
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 1084
    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/os/Handler;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 720
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    .line 721
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 720
    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 723
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 725
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 726
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 727
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 728
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 731
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 737
    goto :goto_0

    .line 738
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n:Landroid/graphics/Bitmap;

    .line 739
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lo/boe;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 740
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 743
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;

    invoke-direct {v1, p0, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 753
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 1090
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 1092
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d:Lo/egn;

    .line 1097
    :cond_0
    return-void
.end method

.method private n()V
    .locals 5

    .line 1178
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1179
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e()Ljava/io/File;

    move-result-object v3

    .line 1180
    const/4 v4, 0x0

    .line 1181
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 1182
    const-string v0, "com.huawei.health.fileprovider"

    invoke-static {p0, v0, v3}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 1183
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 1185
    :cond_0
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 1187
    :goto_0
    const-string v0, "output"

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1188
    const-string v0, "com.huawei.camera"

    const/4 v1, 0x1

    invoke-static {p0, v2, v0, v1}, Lo/bnx;->d(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;I)Z

    .line 1189
    return-void
.end method

.method private o()V
    .locals 3

    .line 1165
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->m:Landroid/content/Intent;

    .line 1166
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->m:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 1167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->m:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 1168
    if-eqz v2, :cond_0

    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1169
    const-string v0, "group"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    .line 1170
    const-string v0, "image_type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1171
    const-string v0, "image_type"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f:I

    .line 1175
    :cond_0
    return-void
.end method

.method private p()V
    .locals 1

    .line 1215
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    .line 1216
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .line 678
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 679
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult: requestCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 681
    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 684
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e()Ljava/io/File;

    move-result-object v4

    .line 685
    const/4 v5, 0x0

    .line 686
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 687
    const-string v0, "com.huawei.health.fileprovider"

    invoke-static {p0, v0, v4}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    goto :goto_0

    .line 689
    :cond_0
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    .line 691
    :goto_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Landroid/net/Uri;)V

    .line 692
    goto :goto_2

    .line 695
    :pswitch_1
    :try_start_0
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 699
    goto :goto_2

    .line 696
    :catch_0
    move-exception v6

    .line 697
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const-string v1, "GroupHeadImageActivity onActivityResult get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 698
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->finish()V

    .line 700
    goto :goto_2

    .line 702
    :pswitch_2
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d(Landroid/content/Intent;)V

    .line 703
    goto :goto_2

    .line 705
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i()V

    .line 706
    goto :goto_2

    .line 708
    :goto_1
    goto :goto_2

    .line 711
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->d()V

    .line 713
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 420
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 421
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_group_head_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->setContentView(I)V

    .line 422
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p:Landroid/content/Context;

    .line 423
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->o()V

    .line 424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 425
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const-string v1, "grpHeadImageActivity group is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->finish()V

    .line 427
    return-void

    .line 429
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b()V

    .line 430
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->f()V

    .line 431
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1102
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->k()V

    .line 1103
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 1104
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 1221
    sget v0, Lcom/huawei/android/sns/R$array;->head_image_save_item:I

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    invoke-static {p0, v0, v1}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 1229
    const/4 v0, 0x0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 1193
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1194
    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    array-length v0, p3

    if-lez v0, :cond_2

    .line 1195
    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1196
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->n()V

    .line 1197
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p()V

    goto :goto_1

    .line 1199
    :cond_0
    const/4 v2, 0x0

    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_2

    .line 1200
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p3

    if-ge v2, v0, :cond_1

    aget v0, p3, v2

    if-nez v0, :cond_1

    .line 1202
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->p()V

    .line 1203
    goto :goto_1

    .line 1199
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1209
    :cond_2
    :goto_1
    return-void
.end method
