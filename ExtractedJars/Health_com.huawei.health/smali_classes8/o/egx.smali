.class public Lo/egx;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egx$d;
    }
.end annotation


# static fields
.field private static a:J

.field private static c:J

.field public static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 53
    const-class v0, Lo/egx;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/egx;->e:Ljava/lang/String;

    .line 55
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/egx;->a:J

    .line 56
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/egx;->c:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 60
    return-void
.end method

.method private static a(Landroid/content/Context;I)V
    .locals 7

    .line 367
    sget-wide v0, Lo/egx;->c:J

    sget-wide v2, Lo/egx;->a:J

    sub-long v4, v0, v2

    .line 368
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 369
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    const-string v0, "duration"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->bS:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 373
    return-void
.end method

.method static synthetic b(J)J
    .locals 0

    .line 52
    sput-wide p0, Lo/egx;->c:J

    return-wide p0
.end method

.method static synthetic c(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 52
    invoke-static {p0, p1, p2}, Lo/egx;->d(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic d(J)J
    .locals 0

    .line 52
    sput-wide p0, Lo/egx;->a:J

    return-wide p0
.end method

.method static synthetic d(Landroid/content/Context;I)V
    .locals 0

    .line 52
    invoke-static {p0, p1}, Lo/egx;->a(Landroid/content/Context;I)V

    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 5

    .line 358
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWebViewActivity() -> url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", jumpModeKey = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 360
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 361
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 362
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 363
    return-void
.end method
