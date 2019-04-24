.class final Lo/bsa$2;
.super Lo/bsf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsa;->b(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bsr;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/bsr;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/bsa$2;->d:Ljava/lang/String;

    iput-object p2, p0, Lo/bsa$2;->b:Lo/bsr;

    invoke-direct {p0}, Lo/bsf;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 2

    .line 195
    iget-object v0, p0, Lo/bsa$2;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$2;->b:Lo/bsr;

    invoke-static {v0, p2, v1}, Lo/bsa;->a(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V

    .line 196
    return-void
.end method

.method public onProgress(JJZ)V
    .locals 6

    .line 205
    iget-object v0, p0, Lo/bsa$2;->b:Lo/bsr;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/bsr;->e(JJZ)V

    .line 206
    return-void
.end method

.method public onSuccess(Lorg/json/JSONObject;)V
    .locals 2

    .line 200
    iget-object v0, p0, Lo/bsa$2;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$2;->b:Lo/bsr;

    invoke-static {v0, p1, v1}, Lo/bsa;->c(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 201
    return-void
.end method
