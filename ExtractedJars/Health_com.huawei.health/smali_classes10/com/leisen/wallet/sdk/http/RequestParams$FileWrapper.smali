.class public Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/leisen/wallet/sdk/http/RequestParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FileWrapper"
.end annotation


# instance fields
.field public final contentType:Ljava/lang/String;

.field public final file:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;->file:Ljava/io/File;

    .line 212
    iput-object p2, p0, Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;->contentType:Ljava/lang/String;

    .line 213
    return-void
.end method
