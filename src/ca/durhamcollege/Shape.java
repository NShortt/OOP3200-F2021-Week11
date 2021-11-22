package ca.durhamcollege;

import java.util.ArrayList;

public abstract class Shape
{
    // Private Instance Variables
    private ArrayList<Vector2D> vertices;
    private ArrayList<Line> edges;

    // Public Properties

    // Constructors

    public Shape()
    {
        vertices.add(Vector2D.zero());
        edges.add(new Line());
    }

    public Shape(Vector2D[] vertices)
    {
        build(vertices);
    }

    // Private Methods

    private void build(Vector2D[] vertices)
    {
        // Add all vertices to the shape
        for (int i = 0; i < vertices.length; i++)
        {
            this.vertices.add(vertices[i]);
        }

        // Build Edges
        for (int i = 0; i < this.vertices.size(); i++)
        {
            if (i < this.vertices.size() - 1)
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(i + 1)));
            }
            else
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(0)));
            }
        }
    }

    // Public Methods

}
