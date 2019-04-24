.class public Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:Landroid/view/ViewGroup;

.field private d:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

.field private e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/wallet/commonbase/router/WalletProviderRegister;>;"
        }
    .end annotation
.end field

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->k:Z

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->f:Ljava/util/List;

    return-void
.end method

.method private a()V
    .locals 4

    .line 111
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->f:Ljava/util/List;

    new-instance v1, Lo/ecn;

    invoke-direct {v1}, Lo/ecn;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->f:Ljava/util/List;

    new-instance v1, Lo/ecj;

    invoke-direct {v1}, Lo/ecj;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->f:Ljava/util/List;

    new-instance v1, Lo/ecq;

    invoke-direct {v1}, Lo/ecq;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->f:Ljava/util/List;

    new-instance v1, Lo/ecf;

    invoke-direct {v1}, Lo/ecf;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/wallet/commonbase/router/WalletProviderRegister;

    .line 118
    invoke-virtual {v3}, Lcom/huawei/wallet/commonbase/router/WalletProviderRegister;->b()V

    .line 119
    goto :goto_0

    .line 120
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->k:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    return-object v0
.end method

.method private d()V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 156
    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    .line 145
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

    if-nez v0, :cond_0

    .line 147
    new-instance v0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$1;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;

    invoke-virtual {p0, v0, v2}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 150
    return-void
.end method

.method private e(Landroid/os/Bundle;)V
    .locals 4

    .line 209
    sget v0, Lcom/huawei/wallet/R$id;->content:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->c:Landroid/view/ViewGroup;

    .line 210
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->a:Z

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/huawei/wallet/utils/UIUtil;->b(Landroid/app/Activity;Landroid/view/ViewGroup;Z)V

    .line 213
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "card_holder"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    .line 214
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v3

    .line 215
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 216
    new-instance v0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-direct {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    .line 217
    sget v0, Lcom/huawei/wallet/R$id;->content:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    const-string v2, "card_holder"

    invoke-virtual {v3, v0, v1, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 219
    :cond_1
    iput-object p0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->b:Landroid/content/Context;

    .line 221
    return-void
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;Z)Z
    .locals 0

    .line 48
    iput-boolean p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->k:Z

    return p1
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 226
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 227
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 251
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 252
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->a:Z

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/huawei/wallet/utils/UIUtil;->b(Landroid/app/Activity;Landroid/view/ViewGroup;Z)V

    .line 255
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 166
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " Enter onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 168
    sget v0, Lcom/huawei/wallet/R$layout;->act_card_holder:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->setContentView(I)V

    .line 169
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->destroy()V

    .line 170
    sget v0, Lcom/huawei/wallet/R$string;->pocket_icon_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->showHead(I)V

    .line 172
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e(Landroid/os/Bundle;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->mDevicesConnecteStatus:I

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/PluginPay;->setShowPay(Z)V

    .line 178
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e()V

    .line 179
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->a()V

    .line 180
    invoke-static {}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getInstance()Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->initConfig(Landroid/content/Context;)V

    .line 181
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 241
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onDestroy()V

    .line 242
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/PluginPay;->setShowPay(Z)V

    .line 243
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->destroy()V

    .line 244
    invoke-direct {p0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d()V

    .line 245
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-static {}, Lcom/huawei/nfc/util/WalletPluginClassUtil;->releasePlugin()V

    .line 247
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 269
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    .line 272
    array-length v0, p3

    if-nez v0, :cond_0

    .line 273
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "grantResults length 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    return-void

    .line 276
    :cond_0
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_2

    .line 279
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6210\u529f\u83b7\u53d6\u6743\u9650"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b()V

    goto :goto_0

    .line 285
    :cond_1
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult rejected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :cond_2
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 160
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onResume()V

    .line 161
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c()V

    .line 162
    return-void
.end method

.method public refreshView(Z)V
    .locals 4

    .line 259
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->refreshView(Z)V

    .line 260
    iget v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->mDevicesConnecteStatus:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 261
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshView,mDevicesConnecteStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->mDevicesConnecteStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->destroy()V

    goto :goto_0

    .line 263
    :cond_0
    if-eqz p1, :cond_1

    .line 264
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c()V

    .line 266
    :cond_1
    :goto_0
    return-void
.end method

.method public watchConnectedChange(I)V
    .locals 4

    .line 125
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->watchConnectedChange(I)V

    .line 126
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " watchConnectedChange onReceive connectedStatus "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 128
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " Context is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void

    .line 132
    :cond_0
    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    .line 133
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "watch dis connectedStatus "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 137
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->k:Z

    if-nez v0, :cond_2

    .line 138
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refreshCardList()V

    .line 141
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->k:Z

    .line 142
    return-void
.end method
