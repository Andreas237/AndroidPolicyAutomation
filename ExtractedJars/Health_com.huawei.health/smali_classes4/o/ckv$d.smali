.class Lo/ckv$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hianalytics/hmacgen/HmacGenerator$HmacCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ckv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private e:Lo/ckk;


# direct methods
.method public constructor <init>(Lo/ckk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ckv$d;->e:Lo/ckk;

    return-void
.end method


# virtual methods
.method public onGenerate(J[B)V
    .locals 2

    iget-object v0, p0, Lo/ckv$d;->e:Lo/ckk;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ckk;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lo/ckv$d;->e:Lo/ckk;

    invoke-static {p3}, Lo/cjr;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ckk;->d(Ljava/lang/String;)V

    return-void
.end method
