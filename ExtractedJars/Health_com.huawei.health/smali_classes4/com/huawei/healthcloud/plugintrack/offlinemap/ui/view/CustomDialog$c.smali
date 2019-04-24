.class public final enum Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

.field private static final synthetic c:[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

.field public static final enum e:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 59
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    const-string v1, "PROGRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    .line 58
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->c:[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 58
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;
    .locals 1

    .line 58
    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    return-object v0
.end method

.method public static values()[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;
    .locals 1

    .line 58
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->c:[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    invoke-virtual {v0}, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    return-object v0
.end method
