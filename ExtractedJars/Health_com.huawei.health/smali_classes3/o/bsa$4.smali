.class final Lo/bsa$4;
.super Lo/bsf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsr;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/bsr;)V
    .locals 0

    .line 312
    iput-object p1, p0, Lo/bsa$4;->d:Ljava/lang/String;

    iput-object p2, p0, Lo/bsa$4;->a:Lo/bsr;

    invoke-direct {p0}, Lo/bsf;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 2

    .line 315
    iget-object v0, p0, Lo/bsa$4;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$4;->a:Lo/bsr;

    invoke-static {v0, p2, v1}, Lo/bsa;->a(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V

    .line 316
    return-void
.end method

.method public onSuccess(Lorg/json/JSONObject;)V
    .locals 2

    .line 320
    iget-object v0, p0, Lo/bsa$4;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$4;->a:Lo/bsr;

    invoke-static {v0, p1, v1}, Lo/bsa;->c(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 321
    return-void
.end method
