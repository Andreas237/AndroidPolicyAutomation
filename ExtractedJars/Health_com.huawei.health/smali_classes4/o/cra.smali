.class public Lo/cra;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cra$d;
    }
.end annotation


# instance fields
.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hihealthservice/auth/WhiteListApp;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lo/cra;->e:Ljava/util/Map;

    .line 17
    return-void
.end method

.method synthetic constructor <init>(Lo/cra$3;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/cra;-><init>()V

    return-void
.end method

.method public static c()Lo/cra;
    .locals 1

    .line 27
    sget-object v0, Lo/cra$d;->c:Lo/cra;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/WhiteListApp;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/cra;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/auth/WhiteListApp;

    return-object v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hihealthservice/auth/WhiteListApp;>;)V"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lo/cra;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 36
    iput-object p1, p0, Lo/cra;->e:Ljava/util/Map;

    .line 37
    return-void
.end method
