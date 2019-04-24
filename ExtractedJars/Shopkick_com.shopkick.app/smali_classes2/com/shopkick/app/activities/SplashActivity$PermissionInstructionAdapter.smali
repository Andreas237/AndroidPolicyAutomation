.class Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "SplashActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/SplashActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PermissionInstructionAdapter"
.end annotation


# instance fields
.field private final POSTFIX_CONTAINER_TAG:Ljava/lang/String;

.field private permissionGroupLinkToSettings:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private permissionGroupsToRequest:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/activities/SplashActivity;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/SplashActivity;)V
    .locals 6

    .line 755
    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    const-string v0, "_container"

    .line 750
    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->POSTFIX_CONTAINER_TAG:Ljava/lang/String;

    .line 752
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupsToRequest:Ljava/util/ArrayList;

    .line 753
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupLinkToSettings:Ljava/util/HashSet;

    .line 757
    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    .line 758
    invoke-static {p1, v4}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 759
    invoke-static {p1, v4}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_0

    .line 760
    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity;->access$200(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v4

    invoke-virtual {v4, v5, v2}, Lcom/shopkick/app/application/AppPreferences;->setAskPermissionGroupDisabled(Ljava/lang/String;Z)V

    goto :goto_1

    .line 763
    :cond_0
    iget-object v4, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupsToRequest:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 764
    iget-object v4, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupsToRequest:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 767
    :cond_1
    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity;->access$200(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/shopkick/app/application/AppPreferences;->getAskPermissionGroupDisabled(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 768
    iget-object v4, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupLinkToSettings:Ljava/util/HashSet;

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;)V
    .locals 0

    .line 748
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->logButtonImpression()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;Ljava/lang/String;)V
    .locals 0

    .line 748
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->setPermissionLinkToSettings(Ljava/lang/String;)V

    return-void
.end method

.method private getContainerTag(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 775
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_container"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private logButtonImpression()V
    .locals 6

    .line 795
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v0}, Lcom/shopkick/app/activities/SplashActivity;->access$1300(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    .line 796
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupsToRequest:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 798
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v1}, Lcom/shopkick/app/activities/SplashActivity;->access$1300(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v1

    invoke-direct {p0, v0}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->getContainerTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const v2, 0x7f0905ae

    .line 801
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 802
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x17c

    goto :goto_0

    :cond_1
    const/16 v1, 0x17d

    .line 803
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    const/4 v3, 0x3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v2, v1, v3, v4}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermissionGroup(Landroid/content/Context;II[Ljava/lang/String;)V

    return-void
.end method

.method private setPermissionLinkToSettings(Ljava/lang/String;)V
    .locals 2

    .line 807
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 808
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupLinkToSettings:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 809
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v0}, Lcom/shopkick/app/activities/SplashActivity;->access$1300(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/widget/SKViewPager;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->getContainerTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->updateButton(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method private updateButton(Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_1

    const v0, 0x7f0905ae

    .line 780
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090674

    .line 781
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 784
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupLinkToSettings:Ljava/util/HashSet;

    invoke-virtual {v1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 785
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 786
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 788
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 789
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 885
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 890
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupsToRequest:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 13
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 814
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c01c5

    .line 815
    invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f090767

    .line 817
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0901e6

    .line 818
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f090048

    .line 819
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f0905ae

    .line 820
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f090674

    .line 821
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 823
    iget-object v7, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->permissionGroupsToRequest:Ljava/util/ArrayList;

    invoke-virtual {v7, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 824
    invoke-direct {p0, v7}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->getContainerTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 825
    invoke-virtual {v6, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 826
    invoke-virtual {v5, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 831
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const v9, -0x540bd380

    const/4 v10, -0x1

    const/4 v11, 0x1

    if-eq v8, v9, :cond_1

    const v9, 0x31640343

    if-eq v8, v9, :cond_0

    goto :goto_0

    :cond_0
    const-string v8, "android.permission-group.LOCATION"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_1
    const-string v1, "android.permission-group.PHONE"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v11

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v10

    :goto_1
    packed-switch v1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const v10, 0x7f08023f

    .line 841
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    const v8, 0x7f1104c7

    invoke-virtual {v1, v8}, Lcom/shopkick/app/activities/SplashActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 842
    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 843
    new-instance v9, Landroid/text/style/StyleSpan;

    invoke-direct {v9, v11}, Landroid/text/style/StyleSpan;-><init>(I)V

    const-string v12, "."

    .line 844
    invoke-virtual {v1, v12}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v12

    add-int/2addr v12, v11

    .line 845
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v11, 0x11

    .line 843
    invoke-virtual {v8, v9, v12, v1, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 847
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :pswitch_1
    const v10, 0x7f08023e

    const v1, 0x7f1104c6

    .line 834
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 852
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v1}, Lcom/shopkick/app/activities/SplashActivity;->access$200(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getAllPermissionsGrantedBefore()Z

    move-result v1

    if-nez v1, :cond_3

    .line 853
    invoke-virtual {p0}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->getCount()I

    move-result v1

    sub-int/2addr v1, p2

    packed-switch v1, :pswitch_data_1

    goto :goto_3

    :pswitch_2
    const p2, 0x7f1104c9

    goto :goto_4

    :pswitch_3
    const p2, 0x7f1104c8

    goto :goto_4

    :cond_3
    :goto_3
    const p2, 0x7f1104ca

    .line 865
    :goto_4
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(I)V

    .line 866
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 869
    invoke-direct {p0, v0, v7}, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->updateButton(Landroid/view/View;Ljava/lang/String;)V

    .line 871
    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 872
    invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 873
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 895
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 896
    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionsForGroup(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x4

    const v2, 0x7f0905ae

    if-ne v0, v2, :cond_0

    if-eqz p1, :cond_2

    .line 898
    array-length v0, p1

    if-lez v0, :cond_2

    .line 900
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    const/16 v2, 0x17c

    invoke-static {v0, v2, v1, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermission(Landroid/content/Context;II[Ljava/lang/String;)V

    .line 903
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    const/16 v1, 0x1c

    invoke-static {v0, p1, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const v2, 0x7f090674

    if-ne v0, v2, :cond_2

    if-eqz p1, :cond_1

    .line 909
    array-length v0, p1

    if-lez v0, :cond_1

    .line 911
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    const/16 v2, 0x17d

    invoke-static {v0, v2, v1, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermission(Landroid/content/Context;II[Ljava/lang/String;)V

    .line 915
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$PermissionInstructionAdapter;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionUtils;->openSettingsApp(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void
.end method
