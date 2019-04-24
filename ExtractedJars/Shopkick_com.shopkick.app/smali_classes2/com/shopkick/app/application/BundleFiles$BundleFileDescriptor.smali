.class public Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;
.super Ljava/lang/Object;
.source "BundleFiles.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/BundleFiles;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BundleFileDescriptor"
.end annotation


# instance fields
.field fileName:Ljava/lang/String;

.field filePath:Ljava/lang/String;

.field length:J

.field offset:J

.field final synthetic this$0:Lcom/shopkick/app/application/BundleFiles;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/BundleFiles;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->this$0:Lcom/shopkick/app/application/BundleFiles;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p2, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->filePath:Ljava/lang/String;

    .line 26
    iput-object p3, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->fileName:Ljava/lang/String;

    .line 27
    iput-wide p4, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->offset:J

    .line 28
    iput-wide p6, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->length:J

    return-void
.end method


# virtual methods
.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getLength()J
    .locals 2

    .line 44
    iget-wide v0, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->length:J

    return-wide v0
.end method

.method public getOffset()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->offset:J

    return-wide v0
.end method
