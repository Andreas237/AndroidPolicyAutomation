.class public Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Lo/biu;

.field private c:Ljava/lang/String;

.field private d:Landroid/widget/ImageView;

.field private e:Z

.field private f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->c:Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e:Z

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->a:Landroid/widget/ListView;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->b:Lo/biu;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->d:Landroid/widget/ImageView;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->f:Landroid/widget/TextView;

    return-void
.end method

.method private a()V
    .locals 2

    .line 224
    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/ClipboardManager;

    .line 225
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 226
    sget v0, Lcom/huawei/android/sns/R$string;->sns_already_copied:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 227
    return-void
.end method

.method private c()V
    .locals 3

    .line 110
    sget v0, Lcom/huawei/android/sns/R$id;->listview_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->a:Landroid/widget/ListView;

    .line 111
    new-instance v0, Lo/biu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->c:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e:Z

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->d(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/biu;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->b:Lo/biu;

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->b:Lo/biu;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 114
    sget v0, Lcom/huawei/android/sns/R$id;->image_tag:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->d:Landroid/widget/ImageView;

    .line 115
    sget v0, Lcom/huawei/android/sns/R$id;->text_tag:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->f:Landroid/widget/TextView;

    .line 117
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e:Z

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_web_detail_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_qr_url:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_text_detail_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_qr_text:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 127
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Z)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 139
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    return-object v1

    .line 143
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    return-object v1
.end method

.method private d()V
    .locals 2

    .line 98
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 101
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 103
    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 234
    const-string v0, "QRTextUrlActivity"

    const-string v1, "goto inner browser"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-static {p0, v0, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->finish()V

    .line 237
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 3

    .line 152
    if-eqz p1, :cond_2

    .line 154
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 155
    if-nez v2, :cond_0

    .line 157
    return-void

    .line 159
    :cond_0
    const-string v0, "isUrl"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    const-string v0, "isUrl"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e:Z

    .line 164
    :cond_1
    const-string v0, "qrContent"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    const-string v0, "qrContent"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->c:Ljava/lang/String;

    .line 169
    :cond_2
    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 242
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 243
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 244
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 78
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_result_texturl:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->setContentView(I)V

    .line 80
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->d()V

    .line 83
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    goto :goto_0

    .line 85
    :catch_0
    move-exception v2

    .line 87
    const-string v0, "QRTextUrlActivity"

    const-string v1, "QRTextUrlActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->c()V

    .line 91
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 174
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_qr_texturl_blue_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 175
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 200
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_copy_text:I

    if-ne v0, v1, :cond_0

    .line 202
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->a()V

    goto :goto_0

    .line 204
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_copy_url:I

    if-ne v0, v1, :cond_1

    .line 206
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->a()V

    goto :goto_0

    .line 208
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_open_url:I

    if-ne v0, v1, :cond_2

    .line 210
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e()V

    goto :goto_0

    .line 212
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_3

    .line 214
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->onBackPressed()V

    .line 215
    const/4 v0, 0x1

    return v0

    .line 217
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 181
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;->e:Z

    if-eqz v0, :cond_0

    .line 183
    sget v0, Lcom/huawei/android/sns/R$id;->menu_copy_text:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 184
    sget v0, Lcom/huawei/android/sns/R$id;->menu_copy_url:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 185
    sget v0, Lcom/huawei/android/sns/R$id;->menu_open_url:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 189
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_copy_text:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 190
    sget v0, Lcom/huawei/android/sns/R$id;->menu_copy_url:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 191
    sget v0, Lcom/huawei/android/sns/R$id;->menu_open_url:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 194
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method
