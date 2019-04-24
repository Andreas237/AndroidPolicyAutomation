.class Lo/bhc$b;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhc$b$a;
    }
.end annotation


# instance fields
.field private a:Lo/bhc$b$a;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bfh;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 359
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 351
    const/4 v0, 0x5

    iput v0, p0, Lo/bhc$b;->c:I

    .line 360
    iput-object p1, p0, Lo/bhc$b;->d:Landroid/content/Context;

    .line 361
    iput p2, p0, Lo/bhc$b;->c:I

    .line 362
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/bfh;>;)V"
        }
    .end annotation

    .line 381
    iput-object p1, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    .line 382
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 371
    iput p1, p0, Lo/bhc$b;->c:I

    .line 372
    return-void
.end method

.method public e(I)Lo/bfh;
    .locals 3

    .line 426
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 428
    const/4 v0, 0x0

    return-object v0

    .line 430
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 432
    :cond_1
    const-string v0, "NormalGroupMemberCard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GridViewAdapter ArrayIndexOutOfBoundsException position="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " memberList.size()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    .line 433
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 432
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    const/4 v0, 0x0

    return-object v0

    .line 436
    :cond_2
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfh;

    return-object v0
.end method

.method public getCount()I
    .locals 5

    .line 387
    const/4 v3, 0x0

    .line 388
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 390
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 394
    :cond_1
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lo/bhc$b;->c:I

    mul-int/lit8 v1, v1, 0xa

    if-gt v0, v1, :cond_2

    .line 396
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    goto :goto_3

    .line 400
    :cond_2
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 401
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    add-int/lit8 v1, v3, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfh;

    invoke-virtual {v0}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x24

    if-ne v0, v1, :cond_4

    .line 404
    add-int/lit8 v4, v3, -0x3

    :goto_0
    iget v0, p0, Lo/bhc$b;->c:I

    mul-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, -0x3

    if-le v4, v0, :cond_3

    .line 406
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 404
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_3
    goto :goto_2

    .line 412
    :cond_4
    add-int/lit8 v4, v3, -0x2

    :goto_1
    iget v0, p0, Lo/bhc$b;->c:I

    mul-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, -0x2

    if-le v4, v0, :cond_5

    .line 414
    iget-object v0, p0, Lo/bhc$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 412
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    .line 417
    :cond_5
    :goto_2
    iget v0, p0, Lo/bhc$b;->c:I

    mul-int/lit8 v3, v0, 0xa

    .line 420
    :goto_3
    return v3
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 326
    invoke-virtual {p0, p1}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 442
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 448
    invoke-virtual {p0, p1}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v6

    .line 449
    if-nez p2, :cond_0

    .line 451
    iget-object v0, p0, Lo/bhc$b;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_normal_group_member_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 452
    new-instance v0, Lo/bhc$b$a;

    invoke-direct {v0}, Lo/bhc$b$a;-><init>()V

    iput-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    .line 453
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    sget v1, Lcom/huawei/android/sns/R$id;->image_member_image:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lo/bhc$b$a;->e:Landroid/widget/ImageView;

    .line 454
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    sget v1, Lcom/huawei/android/sns/R$id;->text_member_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lo/bhc$b$a;->b:Landroid/widget/TextView;

    .line 455
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 459
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bhc$b$a;

    iput-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    .line 461
    :goto_0
    if-eqz v6, :cond_4

    .line 463
    invoke-virtual {v6}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_1

    .line 464
    invoke-virtual {v6}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->D:Lo/bfp$c;

    if-ne v0, v1, :cond_1

    instance-of v0, v6, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_1

    .line 467
    move-object v7, v6

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 468
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->e:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 469
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bhc$b;->d:Landroid/content/Context;

    invoke-virtual {v7, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    goto/16 :goto_1

    .line 471
    :cond_1
    invoke-virtual {v6}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_2

    instance-of v0, v6, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_2

    .line 474
    move-object v7, v6

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 475
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v2, v2, Lo/bhc$b$a;->e:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 476
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    .line 475
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bhc$b;->d:Landroid/content/Context;

    invoke-virtual {v7, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    goto :goto_1

    .line 479
    :cond_2
    invoke-virtual {v6}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_3

    .line 481
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_add_group_member:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 482
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_btn_add:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 486
    :cond_3
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_del_group_member:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 487
    iget-object v0, p0, Lo/bhc$b;->a:Lo/bhc$b$a;

    iget-object v0, v0, Lo/bhc$b$a;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 490
    :cond_4
    :goto_1
    return-object p2
.end method
