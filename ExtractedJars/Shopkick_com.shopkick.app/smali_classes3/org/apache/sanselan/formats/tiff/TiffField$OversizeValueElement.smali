.class public final Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;
.super Lorg/apache/sanselan/formats/tiff/TiffElement;
.source "TiffField.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/sanselan/formats/tiff/TiffField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "OversizeValueElement"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/sanselan/formats/tiff/TiffField;


# direct methods
.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/TiffField;II)V
    .locals 0

    .line 81
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;->this$0:Lorg/apache/sanselan/formats/tiff/TiffField;

    .line 82
    invoke-direct {p0, p2, p3}, Lorg/apache/sanselan/formats/tiff/TiffElement;-><init>(II)V

    return-void
.end method


# virtual methods
.method public getElementDescription(Z)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "OversizeValueElement, tag: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;->this$0:Lorg/apache/sanselan/formats/tiff/TiffField;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/TiffField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fieldType: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;->this$0:Lorg/apache/sanselan/formats/tiff/TiffField;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/TiffField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
