.class public Lcom/squareup/haha/perflib/StackFrame;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COMPILED_METHOD:I = -0x2

.field public static final NATIVE_METHOD:I = -0x3

.field public static final NO_LINE_NUMBER:I = 0x0

.field public static final UNKNOWN_LOCATION:I = -0x1


# instance fields
.field mFilename:Ljava/lang/String;

.field mId:J

.field mLineNumber:I

.field mMethodName:Ljava/lang/String;

.field mSerialNumber:I

.field mSignature:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-wide p1, p0, Lcom/squareup/haha/perflib/StackFrame;->mId:J

    .line 46
    iput-object p3, p0, Lcom/squareup/haha/perflib/StackFrame;->mMethodName:Ljava/lang/String;

    .line 47
    iput-object p4, p0, Lcom/squareup/haha/perflib/StackFrame;->mSignature:Ljava/lang/String;

    .line 48
    iput-object p5, p0, Lcom/squareup/haha/perflib/StackFrame;->mFilename:Ljava/lang/String;

    .line 49
    iput p6, p0, Lcom/squareup/haha/perflib/StackFrame;->mSerialNumber:I

    .line 50
    iput p7, p0, Lcom/squareup/haha/perflib/StackFrame;->mLineNumber:I

    .line 51
    return-void
.end method

.method private lineNumberString()Ljava/lang/String;
    .locals 1

    .line 55
    iget v0, p0, Lcom/squareup/haha/perflib/StackFrame;->mLineNumber:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 57
    :pswitch_0
    const-string v0, "No line number"

    return-object v0

    .line 59
    :pswitch_1
    const-string v0, "Unknown line number"

    return-object v0

    .line 61
    :pswitch_2
    const-string v0, "Compiled method"

    return-object v0

    .line 63
    :pswitch_3
    const-string v0, "Native method"

    return-object v0

    .line 66
    :goto_0
    iget v0, p0, Lcom/squareup/haha/perflib/StackFrame;->mLineNumber:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/squareup/haha/perflib/StackFrame;->mMethodName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/haha/perflib/StackFrame;->mSignature:Ljava/lang/String;

    const/16 v2, 0x2f

    const/16 v3, 0x2e

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/haha/perflib/StackFrame;->mFilename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/squareup/haha/perflib/StackFrame;->lineNumberString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
