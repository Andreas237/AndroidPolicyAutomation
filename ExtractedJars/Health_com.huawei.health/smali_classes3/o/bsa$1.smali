.class final Lo/bsa$1;
.super Lo/bsf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Lo/bsr;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/bsr;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lo/bsa$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lo/bsa$1;->d:Lo/bsr;

    invoke-direct {p0}, Lo/bsf;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 2

    .line 267
    iget-object v0, p0, Lo/bsa$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$1;->d:Lo/bsr;

    invoke-static {v0, p2, v1}, Lo/bsa;->a(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V

    .line 268
    return-void
.end method

.method public onSuccess(Lorg/json/JSONObject;)V
    .locals 2

    .line 273
    iget-object v0, p0, Lo/bsa$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lo/bsa$1;->d:Lo/bsr;

    invoke-static {v0, p1, v1}, Lo/bsa;->c(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 274
    return-void
.end method
