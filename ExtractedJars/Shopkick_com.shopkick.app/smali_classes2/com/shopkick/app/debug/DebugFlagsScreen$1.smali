.class Lcom/shopkick/app/debug/DebugFlagsScreen$1;
.super Ljava/lang/Object;
.source "DebugFlagsScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/debug/DebugFlagsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/debug/DebugFlagsScreen;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 148
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$000(Lcom/shopkick/app/debug/DebugFlagsScreen;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {v0}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$100(Lcom/shopkick/app/debug/DebugFlagsScreen;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 150
    iget-object v1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {v1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$200(Lcom/shopkick/app/debug/DebugFlagsScreen;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    .line 152
    iget-object v2, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {v2}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$300(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/flags/SKFlags;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/flags/SKFlags;->isInDebugMode()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 153
    iget-object v2, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {v2}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$300(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/flags/SKFlags;

    move-result-object v2

    sget-object v3, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LAT:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v2, v3, p1}, Lcom/shopkick/app/flags/SKFlags;->putFloat(Ljava/lang/String;F)V

    .line 154
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$300(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/flags/SKFlags;

    move-result-object p1

    sget-object v2, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_LNG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v2, v0}, Lcom/shopkick/app/flags/SKFlags;->putFloat(Ljava/lang/String;F)V

    .line 155
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$300(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/flags/SKFlags;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/application/AppDebugFlags;->DEBUG_ACCURACY:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/flags/SKFlags;->putFloat(Ljava/lang/String;F)V

    .line 158
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$400(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/presence/PresenceController;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$400(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/presence/PresenceController;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 159
    invoke-virtual {p1, v0}, Lcom/shopkick/app/presence/PresenceController;->handleLocationUpdate(Landroid/location/Location;)V

    .line 163
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$500(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/location/StoreNearbyNotifier;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 164
    iget-object p1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-static {p1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->access$500(Lcom/shopkick/app/debug/DebugFlagsScreen;)Lcom/shopkick/app/location/StoreNearbyNotifier;

    move-result-object p1

    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 165
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 164
    invoke-virtual {p1, v0}, Lcom/shopkick/app/location/StoreNearbyNotifier;->handleLocationUpdate(Landroid/location/Location;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 170
    :catch_0
    new-instance p1, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/debug/DebugFlagsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 172
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/debug/DebugFlagsScreen$1;->this$0:Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/debug/DebugFlagsScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "Uh oh, had trouble parsing"

    .line 173
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const-string v0, "Ok"

    .line 175
    new-instance v1, Lcom/shopkick/app/debug/DebugFlagsScreen$1$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/debug/DebugFlagsScreen$1$1;-><init>(Lcom/shopkick/app/debug/DebugFlagsScreen$1;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 182
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_2
    :goto_0
    return-void
.end method
