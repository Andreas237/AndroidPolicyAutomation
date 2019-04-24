.class Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;
.super Ljava/lang/Object;
.source "ScribeFilesSender.java"

# interfaces
.implements Lio/fabric/sdk/android/services/common/QueueFile$ElementReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->getScribeEventsAsJsonArrayString(Ljava/util/List;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;

.field final synthetic val$appendComma:[Z

.field final synthetic val$out:Ljava/io/ByteArrayOutputStream;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;[ZLjava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;->this$0:Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;

    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;->val$appendComma:[Z

    iput-object p3, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;->val$out:Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/io/InputStream;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 136
    new-array p2, p2, [B

    .line 137
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    .line 139
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;->val$appendComma:[Z

    const/4 v0, 0x0

    aget-boolean v1, p1, v0

    if-eqz v1, :cond_0

    .line 140
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;->val$out:Ljava/io/ByteArrayOutputStream;

    invoke-static {}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;->access$000()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 143
    aput-boolean v1, p1, v0

    .line 145
    :goto_0
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$1;->val$out:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    return-void
.end method
