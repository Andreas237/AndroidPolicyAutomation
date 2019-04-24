.class public Lcom/huawei/health/SelectCountryListActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->d:Ljava/util/List;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->e:Lo/emr;

    return-void
.end method

.method private b()V
    .locals 4

    .line 34
    const v0, 0x7f120468

    invoke-virtual {p0, v0}, Lcom/huawei/health/SelectCountryListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->e:Lo/emr;

    .line 35
    iget-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/health/SelectCountryListActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/SelectCountryListActivity$4;-><init>(Lcom/huawei/health/SelectCountryListActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    const v0, 0x7f1218d2

    invoke-virtual {p0, v0}, Lcom/huawei/health/SelectCountryListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ListView;

    .line 42
    invoke-static {}, Lo/dbf;->y()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->d:Ljava/util/List;

    .line 43
    new-instance v3, Landroid/widget/ArrayAdapter;

    iget-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->d:Ljava/util/List;

    const v1, 0x7f0703da

    invoke-direct {v3, p0, v1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 44
    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 45
    new-instance v0, Lcom/huawei/health/SelectCountryListActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/SelectCountryListActivity$2;-><init>(Lcom/huawei/health/SelectCountryListActivity;)V

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 58
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/SelectCountryListActivity;)Ljava/util/List;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/SelectCountryListActivity;->d:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 4

    .line 62
    const-string v0, "SelectCountryListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/health/SelectCountryListActivity;->finish()V

    .line 64
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 27
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    const-string v0, "SelectCountryListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    const v0, 0x7f0703d9

    invoke-virtual {p0, v0}, Lcom/huawei/health/SelectCountryListActivity;->setContentView(I)V

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/SelectCountryListActivity;->b()V

    .line 31
    return-void
.end method
