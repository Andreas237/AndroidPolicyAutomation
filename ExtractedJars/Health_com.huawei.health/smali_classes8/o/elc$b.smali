.class public Lo/elc$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/elc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lo/mf;

.field public c:Z

.field public d:Lo/eii;

.field public e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/lang/String;Lo/eii;Lo/mf;)V
    .locals 1

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elc$b;->c:Z

    .line 239
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elc$b;->c:Z

    .line 240
    iput-object p1, p0, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 241
    iput-object p2, p0, Lo/elc$b;->a:Ljava/lang/String;

    .line 242
    iput-object p3, p0, Lo/elc$b;->d:Lo/eii;

    .line 243
    iput-object p4, p0, Lo/elc$b;->b:Lo/mf;

    .line 244
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo/eii;)V
    .locals 1

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elc$b;->c:Z

    .line 231
    iput-object p1, p0, Lo/elc$b;->a:Ljava/lang/String;

    .line 232
    iput-object p2, p0, Lo/elc$b;->d:Lo/eii;

    .line 233
    return-void
.end method
