.class public final synthetic Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic f$0:Landroid/content/Context;

.field private final synthetic f$1:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;->f$1:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;->f$1:[Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/shopkick/app/permissions/PermissionUtils;->lambda$showOpenSettingsAppDialog$186(Landroid/content/Context;[Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method